package com.bootcoding.Sorting;

public class ArrayBubbleSort
{
    public static void main(String[] args)
    {

        int[] arr = {30, 40, 50, 60, 70};
        int n = 5;
        int i;
        for (i = 0; i<arr.length; i++)
        {

            for (int j = i + 1; j<arr.length; j++)
            {

                if (arr[j] > arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        for (i = 0; i <arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
