package com.bootcoding.basic;

public class FeetToCentimeter {
    static double converts(double feet){
        double c = feet*30.48;
        return c;

    }

    public static void main(String[] args) {
        double feet = 2.5;
        double c = converts(feet);
        System.out.println( feet + " feet " + " = " + c + " c ");

    }
}
