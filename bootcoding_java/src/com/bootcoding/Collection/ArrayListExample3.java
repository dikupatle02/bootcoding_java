package com.bootcoding.Collection;

import java.util.ArrayList;

public class ArrayListExample3
{
    public static void main(String[] args)
    {
        ArrayList<String>numbers=new ArrayList<>();
        for (int i=1;i<=10;i++)
        {
            numbers.add(i*10+"a");
        }
       // for (int i=0;i<numbers.size();i++)
     //   {
       //     System.out.println(numbers.get(i));
      //  }
        for (String number:numbers)
        {
            System.out.println(number);
        }
    }
}
