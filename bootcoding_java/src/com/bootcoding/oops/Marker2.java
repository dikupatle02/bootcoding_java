package com.bootcoding.oops;

public class Marker2
{
    long id;
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

    public long getId()
    {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
}
