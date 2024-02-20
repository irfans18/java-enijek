package com.enigma.java_enijek.repository;

import com.enigma.java_enijek.dto.response.RevenueDriverResponse;

import java.util.List;

public interface RevenueDriverRepository {
    List<RevenueDriverResponse> findRevenueDriver();
}
