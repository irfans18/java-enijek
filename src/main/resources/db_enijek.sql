--
-- PostgreSQL database dump
--

-- Dumped from database version 16.1 (Ubuntu 16.1-1.pgdg22.04+1)
-- Dumped by pg_dump version 16.1 (Ubuntu 16.1-1.pgdg22.04+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: m_customer; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.m_customer (
    id integer NOT NULL,
    customer_name character varying(100) NOT NULL,
    phone_number character varying(20) NOT NULL,
    address text
);


ALTER TABLE public.m_customer OWNER TO postgres;

--
-- Name: m_customer_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.m_customer_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.m_customer_id_seq OWNER TO postgres;

--
-- Name: m_customer_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.m_customer_id_seq OWNED BY public.m_customer.id;


--
-- Name: m_distance; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.m_distance (
    id integer NOT NULL,
    distance integer NOT NULL,
    price bigint NOT NULL
);


ALTER TABLE public.m_distance OWNER TO postgres;

--
-- Name: m_driver; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.m_driver (
    id integer NOT NULL,
    driver_name character varying(100) NOT NULL,
    license_plate character varying(20) NOT NULL,
    motorcycle_brand character varying(50) NOT NULL,
    phone_number character varying(20) NOT NULL
);


ALTER TABLE public.m_driver OWNER TO postgres;

--
-- Name: m_driver_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.m_driver_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.m_driver_id_seq OWNER TO postgres;

--
-- Name: m_driver_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.m_driver_id_seq OWNED BY public.m_driver.id;


--
-- Name: m_radius_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.m_radius_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.m_radius_id_seq OWNER TO postgres;

--
-- Name: m_radius_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.m_radius_id_seq OWNED BY public.m_distance.id;


--
-- Name: t_order; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.t_order (
    id integer NOT NULL,
    date date NOT NULL,
    customer_id integer
);


ALTER TABLE public.t_order OWNER TO postgres;

--
-- Name: t_order_detail; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.t_order_detail (
    id integer NOT NULL,
    order_id integer,
    driver_id integer,
    radius_id integer,
    entry_point character varying(100) NOT NULL,
    end_point character varying(100) NOT NULL
);


ALTER TABLE public.t_order_detail OWNER TO postgres;

--
-- Name: t_order_detail_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.t_order_detail_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.t_order_detail_id_seq OWNER TO postgres;

--
-- Name: t_order_detail_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.t_order_detail_id_seq OWNED BY public.t_order_detail.id;


--
-- Name: t_order_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.t_order_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.t_order_id_seq OWNER TO postgres;

--
-- Name: t_order_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.t_order_id_seq OWNED BY public.t_order.id;


--
-- Name: m_customer id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.m_customer ALTER COLUMN id SET DEFAULT nextval('public.m_customer_id_seq'::regclass);


--
-- Name: m_distance id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.m_distance ALTER COLUMN id SET DEFAULT nextval('public.m_radius_id_seq'::regclass);


--
-- Name: m_driver id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.m_driver ALTER COLUMN id SET DEFAULT nextval('public.m_driver_id_seq'::regclass);


--
-- Name: t_order id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.t_order ALTER COLUMN id SET DEFAULT nextval('public.t_order_id_seq'::regclass);


--
-- Name: t_order_detail id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.t_order_detail ALTER COLUMN id SET DEFAULT nextval('public.t_order_detail_id_seq'::regclass);


--
-- Data for Name: m_customer; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.m_customer (id, customer_name, phone_number, address) FROM stdin;
1	Dzaki	082387649356	Jl. Sudirman
2	Ahmad	084578310934	\N
3	Riza	082298348712	Jl. Patimura
\.


--
-- Data for Name: m_distance; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.m_distance (id, distance, price) FROM stdin;
1	5	2000
2	8	3000
3	10	5000
\.


--
-- Data for Name: m_driver; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.m_driver (id, driver_name, license_plate, motorcycle_brand, phone_number) FROM stdin;
1	Shodiq	D 2191 LE	Yamaha	082176230923
2	Hafid	BA 3636 FZ	Suzuki	083176230923
\.


--
-- Data for Name: t_order; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.t_order (id, date, customer_id) FROM stdin;
1	2024-02-20	1
\.


--
-- Data for Name: t_order_detail; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.t_order_detail (id, order_id, driver_id, radius_id, entry_point, end_point) FROM stdin;
1	1	1	2	Jl. Sudirman	Jl. Tembakau
2	1	2	1	Jl. Tembakau	Jl. Ganja
\.


--
-- Name: m_customer_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.m_customer_id_seq', 3, true);


--
-- Name: m_driver_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.m_driver_id_seq', 2, true);


--
-- Name: m_radius_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.m_radius_id_seq', 3, true);


--
-- Name: t_order_detail_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.t_order_detail_id_seq', 2, true);


--
-- Name: t_order_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.t_order_id_seq', 1, true);


--
-- Name: m_customer m_customer_phone_number_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.m_customer
    ADD CONSTRAINT m_customer_phone_number_key UNIQUE (phone_number);


--
-- Name: m_customer m_customer_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.m_customer
    ADD CONSTRAINT m_customer_pkey PRIMARY KEY (id);


--
-- Name: m_driver m_driver_license_plate_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.m_driver
    ADD CONSTRAINT m_driver_license_plate_key UNIQUE (license_plate);


--
-- Name: m_driver m_driver_phone_number_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.m_driver
    ADD CONSTRAINT m_driver_phone_number_key UNIQUE (phone_number);


--
-- Name: m_driver m_driver_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.m_driver
    ADD CONSTRAINT m_driver_pkey PRIMARY KEY (id);


--
-- Name: m_distance m_radius_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.m_distance
    ADD CONSTRAINT m_radius_pkey PRIMARY KEY (id);


--
-- Name: t_order_detail t_order_detail_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.t_order_detail
    ADD CONSTRAINT t_order_detail_pkey PRIMARY KEY (id);


--
-- Name: t_order t_order_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.t_order
    ADD CONSTRAINT t_order_pkey PRIMARY KEY (id);


--
-- Name: t_order t_order_customer_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.t_order
    ADD CONSTRAINT t_order_customer_id_fkey FOREIGN KEY (customer_id) REFERENCES public.m_customer(id);


--
-- Name: t_order_detail t_order_detail_driver_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.t_order_detail
    ADD CONSTRAINT t_order_detail_driver_id_fkey FOREIGN KEY (driver_id) REFERENCES public.m_driver(id);


--
-- Name: t_order_detail t_order_detail_order_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.t_order_detail
    ADD CONSTRAINT t_order_detail_order_id_fkey FOREIGN KEY (order_id) REFERENCES public.t_order(id);


--
-- Name: t_order_detail t_order_detail_radius_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.t_order_detail
    ADD CONSTRAINT t_order_detail_radius_id_fkey FOREIGN KEY (radius_id) REFERENCES public.m_distance(id);


--
-- PostgreSQL database dump complete
--

