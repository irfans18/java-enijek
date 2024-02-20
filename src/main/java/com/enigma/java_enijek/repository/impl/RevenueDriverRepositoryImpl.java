package com.enigma.java_enijek.repository.impl;

import com.enigma.java_enijek.dto.response.RevenueDriverResponse;
import com.enigma.java_enijek.repository.RevenueDriverRepository;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RevenueDriverRepositoryImpl implements RevenueDriverRepository {
    EntityManager entityManager;

    public RevenueDriverRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<RevenueDriverResponse> findRevenueDriver() {
        List<RevenueDriverResponse> result = new ArrayList<>();


        List<Object[]> findDriverRevenue = entityManager.createQuery("SELECT to.date, md.driverName, SUM(mds.price * mds.distance) AS revenue FROM TOrderDetail AS tod JOIN TOrder AS to ON to.id = tod.tOrderByOrderId.id JOIN MDriver AS md ON md.id = tod.mDriverByDriverId.id JOIN MDistance AS mds ON mds.id = tod.mDistanceByRadiusId.id GROUP BY to.date, md.driverName", Object[].class).getResultList();

        for (Object[] objects : findDriverRevenue) {
            result.add(new RevenueDriverResponse((Date) objects[0], (String) objects[1], (Long) objects[2]));
        }

        return result;
    }
}
