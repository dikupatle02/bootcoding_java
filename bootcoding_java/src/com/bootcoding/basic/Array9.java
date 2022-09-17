package com.bootcoding.basic;

public class Array9 {
    public static void main(String[] args)
    {
        int a[]={10,15,20,25,35,75,80,95};
        int min = a[0];
        for (int i=0; i<8; i++)
        {
            if (a[i]<min){
                min=a[i];
            }


        }
        System.out.println(min);
    }
    }

