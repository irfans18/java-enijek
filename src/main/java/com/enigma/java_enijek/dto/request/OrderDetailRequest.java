package com.enigma.java_enijek.dto.request;

public class OrderDetailRequest {
    private String customerName;
    private String entry_point;
    private String end_point;

    public OrderDetailRequest(String customerName, String entry_point, String end_point) {
        this.customerName = customerName;
        this.entry_point = entry_point;
        this.end_point = end_point;
    }

    public OrderDetailRequest() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEntry_point() {
        return entry_point;
    }

    public void setEntry_point(String entry_point) {
        this.entry_point = entry_point;
    }

    public String getEnd_point() {
        return end_point;
    }

    public void setEnd_point(String end_point) {
        this.end_point = end_point;
    }
}
