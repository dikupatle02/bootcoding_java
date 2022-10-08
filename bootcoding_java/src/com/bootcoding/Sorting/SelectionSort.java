package com.bootcoding.Sorting;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {100,30,70,40,55};
        int n=5;
        int min_index =0;
        int i;
        for (i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {

                if (arr[j] < arr[min_index])
                {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        for(i=0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
