package com.bootcoding.oops;

public class Application
{
    public static void main(String[] args) {
        Marker2 m2=new Marker2();
        m2.setCompany("Apsara");
        m2.setType("Black Marker");
        m2.setColor("RED");
        m2.setPrice(127.00);

        System.out.println(m2.getCompany());
        System.out.println(m2.getColor());
        System.out.println(m2.getType());
        System.out.println(m2.getPrice());

    }
}
