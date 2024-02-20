package com.enigma.java_enijek.entity;

import jakarta.persistence.*;


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
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private TOrder tOrderByOrderId;
    @ManyToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "id")
    private MDriver mDriverByDriverId;
    @ManyToOne
    @JoinColumn(name = "radius_id", referencedColumnName = "id")
    private MDistance mDistanceByRadiusId;

    public TOrderDetail() {
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
