package com.enigma.java_enijek.dto.response;

import java.util.Date;

public class RevenueDriverResponse {

    private Date date;
    private String name;
    private Long revenue;

    public RevenueDriverResponse(Date date, String name, Long revenue) {
        this.date = date;
        this.name = name;
        this.revenue = revenue;
    }

    public RevenueDriverResponse() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "DriverRevenue{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", revenue=" + revenue +
                '}';
    }
}
