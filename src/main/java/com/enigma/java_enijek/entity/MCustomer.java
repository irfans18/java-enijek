package com.enigma.java_enijek.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "m_customer", schema = "public", catalog = "db_enijek")
public class MCustomer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @OneToMany(mappedBy = "mCustomerByCustomerId")
    private Collection<TOrder> tOrdersById;

    public MCustomer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCustomer mCustomer = (MCustomer) o;
        return Objects.equals(id, mCustomer.id) && Objects.equals(customerName, mCustomer.customerName) && Objects.equals(phoneNumber, mCustomer.phoneNumber) && Objects.equals(address, mCustomer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, phoneNumber, address);
    }

    public Collection<TOrder> gettOrdersById() {
        return tOrdersById;
    }

    public void settOrdersById(Collection<TOrder> tOrdersById) {
        this.tOrdersById = tOrdersById;
    }
}
