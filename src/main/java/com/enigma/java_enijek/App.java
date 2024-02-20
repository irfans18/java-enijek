package com.enigma.java_enijek;

import com.enigma.java_enijek.repository.Impl.TotalTransactionThisDayImpl;
import com.enigma.java_enijek.repository.TotalTransactionThisDay;
import com.enigma.java_enijek.util.JpaUtil;
import com.enigma.java_enijek.view.Menu;
import jakarta.persistence.EntityManager;

import java.time.LocalDate;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        Menu menu = new Menu();
        menu.getTotalTransactionThisDay(em);

        em.close();
        JpaUtil.shutdown();

    }
}