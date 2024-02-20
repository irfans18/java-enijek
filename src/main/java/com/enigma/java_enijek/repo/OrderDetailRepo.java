package com.enigma.java_enijek.repo;

import com.enigma.java_enijek.dto.request.OrderDetailRequest;

public interface OrderDetailRepo {
    void save(OrderDetailRequest request);
}
