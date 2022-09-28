package com.bootcoding.Collection;

import java.util.HashMap;

public class HashMapExample
{
    public static void main(String[] args){

        HashMap<String,String> emailids=new HashMap<>();
        emailids.put("std_123" , "IamCoder@gmail.com");
        emailids.put("std_333" , "IamJavaDeveloper@gmail.com");

        String value=emailids.get("std_333");
        System.out.println("Value of std_333=" + value);

    }
}
