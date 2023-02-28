package com.bootcoding.collection1;

import java.util.*;
import java.util.stream.Collectors;

public class Example2OfLinkedList
{
    public static void main(String[] args)
    {
        List<User> list = new LinkedList<>();
        list.add(new User("Khannu", 4, 985674347));
        list.add(new User("Diku", 20, 946287540));
        list.add(new User("Seju", 17, 765309818));
        list.add(new User("Yummu", 7, 498720618));
        list.add(new User("Dhaiu", 4, 936505618));
        list.add(new User("Shitu", 24, 836725015));
        list.add(new User("Ruchi", 26, 837619956));

        Comparator<User> comparator = new Comparator<User>()
        {
            @Override
            public int compare(User u1, User u2)
            {
                if (u1.getAge() > u2.getAge())
                    return 1;
                else
                    return -1;
            }
        };
    }
}

        //List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        //list.stream().sorted().collect(Collectors.toList());
       // sortedList.forEach(System.out::println);

       // Collections.sort(list,Collections.reverseOrder());
        //for (User name : list) {
           // System.out.println(name);
      //  }
       // Collections.sort(list);
      //  list.stream().map(s -> s.getName()).forEach(System.out::print);

       // Collections.reverse(list);
      //  list.stream().forEach(System.out::print);
   // }

//}


