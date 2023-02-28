package com.bootcoding.basic;

public class SumOfEvenOdd {
    public static void main(String[] args) {
      int n=10;
      int even=0;
      int odd=0;

      for (int i=1; i<=n; i++) {
          if ((i % 2) == 0)
              even += i;

          else
              odd += i;
      }
        System.out.println("Sum of first " + n + " Even Number = " + even);
        System.out.println("Sum of First " + n + " Odd Number = " + odd);

    }

}
