package com.bootcoding.basic;

import java.lang.annotation.ElementType;

public class Array1 {
    public static void main(String[] args) {
    int age[]={10,15,20,25,30};
    int rollno[]=new int[5];
    rollno[0]=10;
    rollno[1]=15;
    rollno[2]=20;
    rollno[3]=25;
    rollno[4]=30;

        for(int i=0;i<age.length;i++)
    {
        System.out.println(age[i]);
    }
    }
}
