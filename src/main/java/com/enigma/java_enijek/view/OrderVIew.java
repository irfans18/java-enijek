package com.enigma.java_enijek.view;

import com.enigma.java_enijek.dto.request.OrderDetailRequest;
import com.enigma.java_enijek.repo.OrderDetailRepo;
import com.enigma.java_enijek.repo.impl.OrderDetailRepoImpl;
import jakarta.persistence.EntityManager;

public class OrderVIew {
    private EntityManager em;

    public OrderVIew(EntityManager em) {
        this.em = em;
    }

    public void get(){
        OrderDetailRepo repo = new OrderDetailRepoImpl(em);
        // repo.save(new OrderDetailRequest(
        //         "Ahmad",
        //         "Rumah",
        //         "Kebun Binatang"
        // ));
        repo.save(new OrderDetailRequest(
                "Ahmad",
                "Kebun Binatang",
                "Rumah"
        ));
    }
}
