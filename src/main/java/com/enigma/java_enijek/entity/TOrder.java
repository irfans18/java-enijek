package com.enigma.java_enijek.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "t_order", schema = "public", catalog = "db_enijek")
public class TOrder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private Date date;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private MCustomer mCustomerByCustomerId;
    @OneToMany(mappedBy = "tOrderByOrderId")
    private Collection<TOrderDetail> tOrderDetailsById;

    public TOrder() {
    }

    public TOrder(Date date) {
        this.date = date;
    }

    public TOrder(Date date, MCustomer mCustomerByCustomerId) {
        this.date = date;
        this.mCustomerByCustomerId = mCustomerByCustomerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public MCustomer getmCustomerByCustomerId() {
        return mCustomerByCustomerId;
    }

    public void setmCustomerByCustomerId(MCustomer mCustomerByCustomerId) {
        this.mCustomerByCustomerId = mCustomerByCustomerId;
    }

    public Collection<TOrderDetail> gettOrderDetailsById() {
        return tOrderDetailsById;
    }

    public void settOrderDetailsById(Collection<TOrderDetail> tOrderDetailsById) {
        this.tOrderDetailsById = tOrderDetailsById;
    }
}
