package com.bootcoding.Collection;

import java.util.HashMap;

public class TwoSumHashmap
{
    public static void main(String[] args)
    {
        int target=9;
        int arr[]={2,7,9,4,6};
        TwoSumHashmap t = new TwoSumHashmap();
        int con[] = t.twoSum(arr,target);

            for (int x : con )
            {
                System.out.println(x);
            }
    }
        public int[] twoSum(int[] nums, int target)
        {

            int[]con= new int[2];
            int n=nums.length;
            HashMap<Integer,Integer>twoSum = new HashMap<>();
            for(int i=0; i<nums.length; i++)
            {
                if(twoSum.containsKey(nums[i]))
                {
                    con[0] = twoSum.get(nums[i]);
                    con[1] = i;
                }
                else
                {
                    twoSum.put(target - nums[i], i);
                }
            }
            return con;
        }




}
