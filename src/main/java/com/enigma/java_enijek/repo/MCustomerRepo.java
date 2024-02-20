package com.enigma.java_enijek.repo;

import com.enigma.java_enijek.entity.MCustomer;

public interface MCustomerRepo {
    MCustomer findByName(String name);
}
