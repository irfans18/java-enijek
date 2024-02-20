package com.enigma.java_enijek;

import com.enigma.java_enijek.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        em.close();
        JpaUtil.shutdown();

    }
}