package com.enigma.java_enijek.repo.impl;

import com.enigma.java_enijek.entity.MCustomer;
import com.enigma.java_enijek.repo.MCustomerRepo;
import jakarta.persistence.EntityManager;

public class MCustomerRepoImpl implements MCustomerRepo {
    private EntityManager em;

    public MCustomerRepoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public MCustomer findByName(String name) {
        return em.createQuery("FROM MCustomer WHERE customerName = :name", MCustomer.class).setParameter("name", name).getSingleResult();
    }
}
