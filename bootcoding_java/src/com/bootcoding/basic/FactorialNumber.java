package com.bootcoding.basic;

public class FactorialNumber {
        public static void main(String[] args) {
            int num = 5;
            int factorial = 1;
            while(num > 0) {
                factorial = factorial * num;
                num--;
            }
            System.out.println("The factorial of the number is: " + factorial);
        }

}
