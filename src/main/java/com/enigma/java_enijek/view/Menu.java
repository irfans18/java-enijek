package com.enigma.java_enijek.view;

import com.enigma.java_enijek.repository.Impl.TotalTransactionThisDayImpl;
import com.enigma.java_enijek.repository.TotalTransactionThisDay;
import jakarta.persistence.EntityManager;

public class Menu {
    public void getTotalTransactionThisDay(EntityManager em) {
        TotalTransactionThisDay totalTransactionThisDay = new TotalTransactionThisDayImpl(em);
        System.out.println("Total Transaction This Day : " + totalTransactionThisDay.getTotalTransactionThisDay());
    }
}
