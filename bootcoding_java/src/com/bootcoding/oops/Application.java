package com.bootcoding.oops;

public class Application
{
    public static void main(String[] args)
    {
        Marker2 m2 = new Marker2();
        m2.setCompany("Apsara");
        m2.setType("Black Marker");
        m2.setColor("RED");
        m2.setPrice(127.00);

        System.out.println(m2.getCompany());
        System.out.println(m2.getColor());
        System.out.println(m2.getType());
        System.out.println(m2.getPrice());


        Book javabooks = new Book();
        javabooks.setTitle("wings of fire");
        javabooks.setAuthor("sawra");
        javabooks.setDescription("based on rocket science");
        javabooks.setPublisherName("apj abdul kalam");
        javabooks.setPages(300);
        System.out.println(javabooks.getTitle());
        System.out.println(javabooks.getAuthor());
        System.out.println(javabooks.getDescription());
        System.out.println(javabooks.getPublisherName());
        System.out.println(javabooks.getPages());


        Cycle c = new Cycle();
        c.setBrakes("dis brake");
        c.setCompany("hero");
        c.setPrice(2000);
        c.setWheel(4);
        c.setType("kid cycle");
        System.out.println(c);
        System.out.println(c.getCompany());

        System.out.println(c.getWheel());
        System.out.println(c.getType());

    }
}
