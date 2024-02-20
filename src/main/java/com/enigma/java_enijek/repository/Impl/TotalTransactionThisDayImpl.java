package com.enigma.java_enijek.repository.Impl;

import com.enigma.java_enijek.entity.TOrder;
import com.enigma.java_enijek.entity.TOrderDetail;
import com.enigma.java_enijek.repository.TotalTransactionThisDay;
import jakarta.persistence.EntityManager;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class TotalTransactionThisDayImpl implements TotalTransactionThisDay {
    private final EntityManager entityManager;

    public TotalTransactionThisDayImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Integer getTotalTransactionThisDay() {
        Date now = Date.valueOf(LocalDate.now());
        List<TOrder> dateNow = entityManager.createQuery("FROM TOrder WHERE date = :date", TOrder.class)
                .setParameter("date", now)
                .getResultList();

        return dateNow.stream().map(tOrder -> tOrder.getDate()).toList().size();
    }
}
