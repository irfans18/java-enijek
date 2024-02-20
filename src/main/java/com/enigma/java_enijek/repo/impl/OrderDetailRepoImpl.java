package com.enigma.java_enijek.repo.impl;

import com.enigma.java_enijek.dto.request.OrderDetailRequest;
import com.enigma.java_enijek.entity.*;
import com.enigma.java_enijek.repo.MCustomerRepo;
import com.enigma.java_enijek.repo.MDriverRepo;
import com.enigma.java_enijek.repo.OrderDetailRepo;
import com.enigma.java_enijek.util.EnijekUtils;
import jakarta.persistence.EntityManager;

public class OrderDetailRepoImpl implements OrderDetailRepo {
    private EntityManager em;

    public OrderDetailRepoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(OrderDetailRequest request) {
        em.getTransaction().begin();
        MCustomerRepo customerRepo = new MCustomerRepoImpl(em);
        MCustomer customer = customerRepo.findByName(request.getCustomerName());
        MDriver driver = EnijekUtils.getDriver(em);
        TOrder order = new TOrder(customer);
        MDistance radius = EnijekUtils.getRadius(em);
        TOrderDetail orderDetail = new TOrderDetail(request.getEntry_point(), request.getEnd_point(), order, driver, radius);
        em.persist(orderDetail);
        em.getTransaction().commit();
    }
}
