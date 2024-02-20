package com.enigma.java_enijek.repo.impl;

import com.enigma.java_enijek.entity.MDistance;
import com.enigma.java_enijek.repo.MDistanceRepo;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MDistanceRepoImpl implements MDistanceRepo {
    private EntityManager em;

    public MDistanceRepoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<MDistance> findAll() {
        return em.createQuery("FROM MDistance").getResultList();
    }
}
