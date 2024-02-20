package com.enigma.java_enijek.util;

import com.enigma.java_enijek.entity.MDistance;
import com.enigma.java_enijek.entity.MDriver;
import com.enigma.java_enijek.repo.MDistanceRepo;
import com.enigma.java_enijek.repo.MDriverRepo;
import com.enigma.java_enijek.repo.impl.MDistanceRepoImpl;
import com.enigma.java_enijek.repo.impl.MDriverRepoImpl;
import jakarta.persistence.EntityManager;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;

public class EnijekUtils {
    public static Date getLocalDate(){
        return new java.sql.Date(System.currentTimeMillis());

    }
    public static MDriver getDriver(EntityManager em){
        // Create a Random object
        Random random = new Random();

        // Generate a random integer between 0 and 1
        int randomNumber = random.nextInt(2);

        MDriverRepo repo = new MDriverRepoImpl(em);
        return repo.findAll().get(randomNumber);
    }

    public static MDistance getRadius(EntityManager em){
        // Create a Random object
        Random random = new Random();

        // Generate a random integer between 0 and 1
        int randomNumber = random.nextInt(2);

        MDistanceRepo repo = new MDistanceRepoImpl(em);
        return repo.findAll().get(randomNumber);
    }
}
