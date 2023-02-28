package com.bootcoding.basic;

public class SumOfSeries
{
        public static void main(String[] args)
        {
            int n = 10;
            double i = 1;
            double sum = 0;
            while (i < 5)
            {
                sum += n / i;
                i++;
            }
            System.out.println("Sum of the series: " + sum);
        }

}
