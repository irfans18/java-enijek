package com.enigma.java_enijek;

import com.enigma.java_enijek.dto.response.RevenueDriverResponse;
import com.enigma.java_enijek.repository.impl.RevenueDriverRepositoryImpl;
import com.enigma.java_enijek.util.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;


public class App {
    public static void main(String[] args) {
        EntityManager entityManager = JpaUtil.getEntityManager();

        List<RevenueDriverResponse> result = new RevenueDriverRepositoryImpl(entityManager).findRevenueDriver();
        System.out.println(result);

        entityManager.close();
        JpaUtil.shutdown();

    }
}