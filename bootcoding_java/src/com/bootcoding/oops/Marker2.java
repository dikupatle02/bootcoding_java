package com.bootcoding.oops;

public class Marker2
{
    String company;
    String type;
    String color;
    double price;

    public void setCompany(String company) {
        this.company = company;
    }

    public void setType(String typ) {
        type = typ;
    }

    public void setColor(String clr) {
        color = clr;
    }

    public void setPrice(double pr) {
        price = pr;
    }

    public String getCompany() {
        return this.company;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
