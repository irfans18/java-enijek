package com.enigma.java_enijek;

import com.enigma.java_enijek.dto.response.OrderDetailResponse;
import com.enigma.java_enijek.entity.TOrderDetail;
import com.enigma.java_enijek.repository.OrderDetailRepository;
import com.enigma.java_enijek.repository.impl.OrderDetailRepositoryImpl;
import com.enigma.java_enijek.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        OrderDetailRepository repository = new OrderDetailRepositoryImpl(em);
        /*List<OrderDetailResponse> responseList = repository.findAll();
        System.out.println(responseList);*/

        List<TOrderDetail> list = repository.findOrderDetail();
        for (TOrderDetail detail : list) {
            System.out.println("=".repeat(100));
            System.out.println("ORDER DETAIL");
            System.out.println("=".repeat(100));
            System.out.println("Customer Name: " + detail.gettOrderByOrderId().getmCustomerByCustomerId().getCustomerName());
            System.out.println("Customer Phone: " + detail.gettOrderByOrderId().getmCustomerByCustomerId().getPhoneNumber());
            System.out.println("Customer Address: " + detail.gettOrderByOrderId().getmCustomerByCustomerId().getAddress());
            System.out.println("Date: " + detail.gettOrderByOrderId().getDate());
            System.out.println("Driver Name: " + detail.getmDriverByDriverId().getDriverName());
            System.out.println("Driver Plate: " + detail.getmDriverByDriverId().getLicensePlate());
            System.out.println("Driver Motorcyle: " + detail.getmDriverByDriverId().getMotorcycleBrand());
            System.out.println("Driver Phone: " + detail.getmDriverByDriverId().getPhoneNumber());
            System.out.println("Distance: " + detail.getmDistanceByRadiusId().getDistance());
            System.out.println("Price: " + detail.getmDistanceByRadiusId().getPrice());
            System.out.println("Entry Point: " + detail.getEntryPoint());
            System.out.println("End Point: " + detail.getEndPoint());
            System.out.println("=".repeat(100) + "\n");
        }

        em.close();
        JpaUtil.shutdown();

    }
}