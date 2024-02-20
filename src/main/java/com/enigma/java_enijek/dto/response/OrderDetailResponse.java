package com.enigma.java_enijek.dto.response;

import java.util.Date;

public class OrderDetailResponse {
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private Date orderDate;
    private String driverName;
    private String licensePlate;
    private String motorcycleBrand;
    private String driverPhone;
    private Integer distance;
    private Integer price;
    private String entryPoint;
    private String endPoint;

    public OrderDetailResponse(String customerName, String customerPhone, String customerAddress, Date orderDate, String driverName, String licensePlate, String motorcycleBrand, String driverPhone, Integer distance, Integer price, String entryPoint, String endPoint) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.orderDate = orderDate;
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.motorcycleBrand = motorcycleBrand;
        this.driverPhone = driverPhone;
        this.distance = distance;
        this.price = price;
        this.entryPoint = entryPoint;
        this.endPoint = endPoint;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMotorcycleBrand() {
        return motorcycleBrand;
    }

    public void setMotorcycleBrand(String motorcycleBrand) {
        this.motorcycleBrand = motorcycleBrand;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "OrderDetailResponse{" +
                "customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", orderDate=" + orderDate +
                ", driverName='" + driverName + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", motorcycleBrand='" + motorcycleBrand + '\'' +
                ", driverPhone='" + driverPhone + '\'' +
                ", distance=" + distance +
                ", price=" + price +
                ", entryPoint='" + entryPoint + '\'' +
                ", endPoint='" + endPoint + '\'' +
                '}';
    }


}
