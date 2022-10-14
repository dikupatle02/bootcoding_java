package com.bootcoding.Collection;


import java.util.HashMap;

public class DuplicateArray2
{
    public static void main(String[] args)
    {
        DuplicateArray2 d= new DuplicateArray2();
        int arr[]={5,15,10,5,15,15,5};
        System.out.println(d.FindDuplicate(arr));
    }
    public int FindDuplicate(int[] arr)
    {
        HashMap<Integer, Integer> countMap= new HashMap<>();

        int count=0;

        for(int i = 0; i < arr.length; i++)
        {
            if (countMap.containsKey(arr[i]))
            {
                int v = countMap.get(arr[i]);
                countMap.put(arr[i], v + 1);
            }
            else
            {
                countMap.put(arr[i], 1);

            }
        }

            for(int value : countMap.values())
            {
                if(value > 1)
                {
                    count++;
                }
            }
        return count;
    }

}
