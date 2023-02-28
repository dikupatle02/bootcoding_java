package com.bootcoding.collection1;

public class ArithmaticOperation {
    public static void main(String[] args){
        modulo();
        preIncrement();
        preDecrement();
        postIncrement();
        postDecrement();

    }

    private static void modulo() {
        int result;
        System.out.println("MODULO (REMINDER)");
        int rem = 5;
        System.out.println("Intial value: " + rem);
        result = rem % 2;
        System.out.println(" rem % 2 = " + result);
        result = rem;
        System.out.println("rem = " + result);
        System.out.println();
    }

    private static void preIncrement() {
        int result;
        System.out.println("PRE INCREMENT BY ONE");
        int preIncrement = 5;


        System.out.println("Initial value: " + preIncrement);
        result = ++preIncrement;
        System.out.println("result = " + result + ", postIncrement = " + preIncrement);
        System.out.println("++preIncrement = " + preIncrement);
        result = 10 +  ++preIncrement;
        System.out.println("result (10 + ++preIncrement) = " + result);
        System.out.println("++preIncrement = " + preIncrement);
        System.out.println();
    }

    private static void postIncrement() {
        int result;
        System.out.println("POST INCREMENT BY ONE");
        int postIncrement = 5;
        double d = 234.744;
        double e = d++;
        System.out.println("e = " + e + " , d = " + d);

        System.out.println("Initial value: " + postIncrement);
        result = postIncrement++;
        System.out.println("result = " + result + ", postIncrement = " + postIncrement);
        System.out.println("postIncrement++ = " + postIncrement);
        result = 10 + postIncrement++;
        System.out.println("result (10 + postIncrement++) = " + result);
        System.out.println("postIncrement++ = " + postIncrement);
        System.out.println();
    }

    private static void preDecrement() {
        int result;
        System.out.println("PRE DECREMENT BY ONE");
        int preDecrement = 5;
        System.out.println("Initial value: " + preDecrement);
        result = --preDecrement;
        System.out.println("result = " + result + ", preDecrement = " + preDecrement);
        System.out.println("--preDecrement = " + preDecrement);
        result = 10 + preDecrement--;
        System.out.println("result (10 + --preDecrement) = " + result);
        System.out.println("--preDecrement = " + preDecrement);
        System.out.println();
    }

    private static void postDecrement() {
        int result;
        System.out.println("POST DECREMENT BY ONE");
        int postDecrement = 5;
        System.out.println("Initial value: " + postDecrement);
        result = postDecrement--;
        System.out.println("result = " + result + ", postDecrement = " + postDecrement);
        System.out.println("postDecrement-- = " + postDecrement);
        result = 10 + postDecrement--;
        System.out.println("result (10 + postDecrement--) = " + result);
        System.out.println("postDecrement-- = " + postDecrement);
        System.out.println();
    }
}
