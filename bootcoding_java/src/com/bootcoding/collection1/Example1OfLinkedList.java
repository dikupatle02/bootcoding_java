package com.bootcoding.collection1;

import java.util.*;

public class Example1OfLinkedList {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("Khannu");
        list.add("Diku");
        list.add("Seju");
        list.add("Yumu");
        list.add("Dhaiu");
        list.add("Shitu");
        list.add("Ruchi");

        Collections.sort(list);
        list.forEach(str -> System.out.println(str) );
    }
}
