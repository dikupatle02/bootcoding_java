import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class MinutesToSeconds {
    static int converts(int min){
         int seconds = min*60;
         return seconds;

    }

    public static void main(String[] args) {
        int min= 10;
        int minutes = converts(min);
        System.out.println(min + " minutes " + " is " + minutes + " seconds ");
        System.out.println(min + " minutes " + " --> " + minutes + " seconds " );
        System.out.println(" Input was " + min + " minutes " + " , " + " Output is " + minutes + " seconds ");
    }
}
