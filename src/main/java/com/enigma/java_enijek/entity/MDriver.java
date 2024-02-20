package com.enigma.java_enijek.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "m_driver", schema = "public", catalog = "db_enijek")
public class MDriver {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "driver_name")
    private String driverName;
    @Basic
    @Column(name = "license_plate")
    private String licensePlate;
    @Basic
    @Column(name = "motorcycle_brand")
    private String motorcycleBrand;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @OneToMany(mappedBy = "mDriverByDriverId",cascade = {CascadeType.PERSIST})
    private Collection<TOrderDetail> tOrderDetailsById;

    public MDriver() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMotorcycleBrand() {
        return motorcycleBrand;
    }

    public void setMotorcycleBrand(String motorcycleBrand) {
        this.motorcycleBrand = motorcycleBrand;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MDriver mDriver = (MDriver) o;
        return Objects.equals(id, mDriver.id) && Objects.equals(driverName, mDriver.driverName) && Objects.equals(licensePlate, mDriver.licensePlate) && Objects.equals(motorcycleBrand, mDriver.motorcycleBrand) && Objects.equals(phoneNumber, mDriver.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, driverName, licensePlate, motorcycleBrand, phoneNumber);
    }

    public Collection<TOrderDetail> gettOrderDetailsById() {
        return tOrderDetailsById;
    }

    public void settOrderDetailsById(Collection<TOrderDetail> tOrderDetailsById) {
        this.tOrderDetailsById = tOrderDetailsById;
    }
}
