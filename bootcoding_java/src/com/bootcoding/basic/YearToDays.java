package com.bootcoding.basic;

public class YearToDays {
   static int converts(int years){
        int days = years*365;
        return days;
    }

    public static void main(String[] args) {
        int years = 20;
        int days = converts(years);
        System.out.println( years + " years " + " = " + days + " days ");
    }
}
