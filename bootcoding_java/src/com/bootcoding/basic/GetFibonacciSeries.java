package com.bootcoding.basic;

public class GetFibonacciSeries {
    public int[] getfibonacciof(int n)
    {
      int res[]=new int[n];
      int p1=1,p2=1,sum=1;
      for (int i=0;i<=5;i++)
      {
          res[i]=sum;
          p1=p2;
          p2=sum;
          sum=p1+p2;
      }

       return res;
    }
}
