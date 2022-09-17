package com.bootcoding.basic;

public class ArrayReverse {
        public static void main(String[] args) {
        int a[] = {10,15,20,25,35,75,80,95};

        int n = a.length;

        for (int i = 0; i<n; i++){
            System.out.print(a[i] + " ");

        }
        for (int i = 0; i < n/2; i++){
            int temp = a[i];
            a[i] = a[n-1-i];
// a[0] = a[4];
// a[0] = a[3];
            a[n-1-i] =temp;
        }
        System.out.println("\n After Reverse");
        for (int i = 0; i<n; i++){
            System.out.print(a[i] + " ");

        }
    }
    }

