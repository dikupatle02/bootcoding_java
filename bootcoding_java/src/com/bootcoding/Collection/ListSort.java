package com.bootcoding.Collection;

import java.util.Collections;
import java.util.LinkedList;

public class ListSort {

    public static   void sort(LinkedList list){

        Collections.sort(list);



       /* list.forEach(str -> System.out.println(str) );*/

       /* int n = list.size()/2;

        System.out.println(list.get(n));*/

        int max = list.size()-1;

        System.out.println(list.get(max));

    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(4);

        ListSort.sort(list);

    }
}
