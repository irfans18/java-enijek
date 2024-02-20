package com.enigma.java_enijek.repo.impl;

import com.enigma.java_enijek.entity.MDriver;
import com.enigma.java_enijek.repo.MDriverRepo;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MDriverRepoImpl implements MDriverRepo {
    private EntityManager em;

    public MDriverRepoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<MDriver> findAll() {
        return em.createQuery("FROM MDriver").getResultList();
    }
}
