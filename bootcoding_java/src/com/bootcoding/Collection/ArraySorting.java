package com.bootcoding.Collection;

public class ArraySorting {

   public static int[] sort(int[]arr){

        for(int i=0;i<=arr.length;i++){

            for (int j = i + 1; j<arr.length; j++)
            {

                if (arr[j] < arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
   }

  public static void main(String[] args) {

     int[]a={8,4,6,2,1,7,3,5,9};

     for(Integer i : ArraySorting.sort(a)){
       System.out.println(i);
     }
  }
}
