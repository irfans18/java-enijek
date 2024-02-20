package com.enigma.java_enijek.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "m_distance", schema = "public", catalog = "db_enijek")
public class MDistance {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "distance")
    private Integer distance;
    @Column(name = "price")
    private Long price;
    @OneToMany(mappedBy = "mDistanceByRadiusId",cascade = {CascadeType.PERSIST})
    private Collection<TOrderDetail> tOrderDetailsById;

    public MDistance() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MDistance mDistance = (MDistance) o;
        return Objects.equals(id, mDistance.id) && Objects.equals(distance, mDistance.distance) && Objects.equals(price, mDistance.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, distance, price);
    }

    public Collection<TOrderDetail> gettOrderDetailsById() {
        return tOrderDetailsById;
    }

    public void settOrderDetailsById(Collection<TOrderDetail> tOrderDetailsById) {
        this.tOrderDetailsById = tOrderDetailsById;
    }
}
