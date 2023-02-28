package com.bootcoding.collection1;

import java.util.ArrayList;
import java.util.List;

public class Example1OfArrayList {
    public static void main(String[] args) {
        List<String>list=new ArrayList<String>();
        list.add("Khannu");
        list.add("Diku");
        list.add("Seju");
        list.add("Yumu");
        list.add("Dhaiu");
        list.add("Shitu");
        list.add("Ruchi");

        for (String str:list){
            System.out.println(str);
        }
    }
}
