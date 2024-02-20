package com.enigma.java_enijek.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "t_order_detail", schema = "public", catalog = "db_enijek")
public class TOrderDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "entry_point")
    private String entryPoint;
    @Column(name = "end_point")
    private String endPoint;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private TOrder tOrderByOrderId;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "driver_id", referencedColumnName = "id")
    private MDriver mDriverByDriverId;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "radius_id", referencedColumnName = "id")
    private MDistance mDistanceByRadiusId;

    public TOrderDetail() {
    }

    public TOrderDetail(String entryPoint, String endPoint, TOrder tOrderByOrderId, MDriver mDriverByDriverId, MDistance mDistanceByRadiusId) {
        this.entryPoint = entryPoint;
        this.endPoint = endPoint;
        this.tOrderByOrderId = tOrderByOrderId;
        this.mDriverByDriverId = mDriverByDriverId;
        this.mDistanceByRadiusId = mDistanceByRadiusId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }


    public TOrder gettOrderByOrderId() {
        return tOrderByOrderId;
    }

    public void settOrderByOrderId(TOrder tOrderByOrderId) {
        this.tOrderByOrderId = tOrderByOrderId;
    }

    public MDriver getmDriverByDriverId() {
        return mDriverByDriverId;
    }

    public void setmDriverByDriverId(MDriver mDriverByDriverId) {
        this.mDriverByDriverId = mDriverByDriverId;
    }

    public MDistance getmDistanceByRadiusId() {
        return mDistanceByRadiusId;
    }

    public void setmDistanceByRadiusId(MDistance mDistanceByRadiusId) {
        this.mDistanceByRadiusId = mDistanceByRadiusId;
    }
}
