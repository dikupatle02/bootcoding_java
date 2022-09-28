package com.bootcoding.Collection;

import java.util.ArrayList;

public class ArrayListExample4
{
    public static void main(String[] args)
    {
        ArrayList numbers=new ArrayList();
        for (int i=1;i<=10;i++)
        {
            numbers.add(i*10);
        }

        ArrayListExample4 e4 = new ArrayListExample4();
        e4.reduceNumbersToZero(numbers);

    }

    public void reduceNumbersToZero(ArrayList<Integer> numbers){
        for(Integer num : numbers)
        {
            int res = numberOfSteps(num);
            System.out.println(num + ": number of steps to make zero : " + res);
        }
    }


 //10
    public int numberOfSteps(int num)
    {
        int count = 0;
        while(num != 0)
        {
            if(num % 2 == 0) // even condition
            {
                num = num / 2; // divide by 2
            }else
            {
                num = num - 1; // substract 1
            }
            count++;
        }
        return count;
    }
}
