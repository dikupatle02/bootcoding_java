package com.bootcoding.oops;

public class Cycle {
    long id;
    String company;
    int wheel;
    String type;
    String brakes;
    double Price;


    public String getCompany() {
        return company;
    }

    public int getWheel() {
        return wheel;
    }

    public String getType() {
        return type;
    }

    public String getBrakes() {
        return brakes;
    }


    public double getPrice() {
        return Price;
    }

    public long getId() {
        return id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setId(long id) {
        this.id = id;
    }


}