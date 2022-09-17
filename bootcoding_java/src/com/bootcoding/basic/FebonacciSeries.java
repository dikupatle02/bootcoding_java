package com.bootcoding.basic;

public class FebonacciSeries
{
    public static void main(String[] args)
    {
        int p1=1,p2=1,sum=1;
        for (int i=0;i<=5;i++){
            System.out.println("febonacci series is " + sum );
            p1=p2;
            p2=sum;
            sum=p1+p2;
        }

    }

}

