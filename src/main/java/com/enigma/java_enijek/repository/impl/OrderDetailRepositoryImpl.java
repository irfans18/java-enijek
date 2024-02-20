package com.enigma.java_enijek.repository.impl;

import com.enigma.java_enijek.dto.response.DriverRevenueResponse;
import com.enigma.java_enijek.dto.response.OrderDetailResponse;
import com.enigma.java_enijek.entity.TOrderDetail;
import com.enigma.java_enijek.repository.OrderDetailRepository;
import jakarta.persistence.EntityManager;

import java.util.List;

public class OrderDetailRepositoryImpl implements OrderDetailRepository {
    private EntityManager entityManager;

    public OrderDetailRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<OrderDetailResponse> findAll() {
        return entityManager.createQuery("FROM TOrderDetail tod " +
                        "JOIN tod.tOrderByOrderId to " +
                        "JOIN to.mCustomerByCustomerId c " +
                        "JOIN tod.mDriverByDriverId dr " +
                        "JOIN tod.mDistanceByRadiusId ds ",
                OrderDetailResponse.class)
                .getResultList();
    }

    @Override
    public List<TOrderDetail> findOrderDetail() {
        return entityManager.createQuery("FROM TOrderDetail ", TOrderDetail.class).getResultList();
    }

    @Override
    public List<DriverRevenueResponse> findDriverRevenue() {
        return entityManager.createQuery(new StringBuilder().append("SELECT NEW com.enigma.java_enijek.dto.response.DriverRevenueResponse(to.date, mdr.driverName, SUM(mds.price * mds.distance) AS revenue) ")
                                .append("FROM TOrderDetail tod ")
                                .append("JOIN tod.tOrderByOrderId to ")
                                .append("JOIN tod.mDriverByDriverId mdr ")
                                .append("JOIN tod.mDistanceByRadiusId mds ")
                                .append("GROUP BY mdr.driverName, to.date ")
                                .append("ORDER BY revenue").toString(),
                DriverRevenueResponse.class)
                .getResultList();
    }


}
