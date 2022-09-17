package com.bootcoding.basic;

public class Array8 {
    public static void main(String[]args)
    {
        int a[]={10,15,20,25,35,75,80,95};
        int max = a[0];
        for (int i=0; i<8; i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }


        }
        System.out.println(max);
    }
}
