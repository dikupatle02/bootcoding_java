package com.bootcoding.oops;

public class Marker
{
    String company;
    String color;
    String type;
    double price;

    public void fillMarker()
    {
        System.out.println("Fill Marker");

    }
    public Marker()
    {
        System.out.println("\nMarker object created");
    }
    public Marker(String cmp,String clr,String t,double p)
    {
        company=cmp;
        color=clr;
        type=t;
        price=p;
    }
    public static void main(String[] args)
    {
        Marker m1=new Marker();
        m1.color="Black";
        m1.company="Camlin";
        m1.type="White Marker";
        m1.price=127.00;

        System.out.println(m1.color);
        System.out.println(m1.company);
        System.out.println(m1.type);
        System.out.println(m1.price);


        Marker m2=new Marker();
        m2.color="Blue";
        m2.company="Camlin";
        m2.type="White Marker";
        m2.price=127.00;

        System.out.println(m2.color);
        System.out.println(m2.company);
        System.out.println(m2.type);
        System.out.println(m2.price);


        Marker m3=new Marker();
        m3.color="Red";
        m3.company="Camlin";
        m3.type="White Marker";
        m3.price=127.00;

        System.out.println(m3.color);
        System.out.println(m3.company);
        System.out.println(m3.type);
        System.out.println(m3.price);


        Marker m4=new Marker();
        m4.color="Green";
        m4.company="Camlin";
        m4.type="White Marker";
        m4.price=127.00;

        System.out.println(m4.color);
        System.out.println(m4.company);
        System.out.println(m4.type);
        System.out.println(m4.price);

        Marker m5=new Marker("Natraj","Black","White",127.00);
        System.out.println(m5.company);
        System.out.println(m5.color);
        System.out.println(m5.type);
        System.out.println(m5.price);

    }

}
