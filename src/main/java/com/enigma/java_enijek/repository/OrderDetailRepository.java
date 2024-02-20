package com.enigma.java_enijek.repository;

import com.enigma.java_enijek.dto.response.DriverRevenueResponse;
import com.enigma.java_enijek.dto.response.OrderDetailResponse;
import com.enigma.java_enijek.entity.TOrderDetail;

import java.util.List;

public interface OrderDetailRepository {
    List<OrderDetailResponse> findAll();
    List<TOrderDetail> findOrderDetail();
    List<DriverRevenueResponse> findDriverRevenue();
}
