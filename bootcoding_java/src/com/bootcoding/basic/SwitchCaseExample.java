package com.bootcoding.basic;

public class SwitchCaseExample
{
    public static void main(String[] args) {
        String month ="January";
        switch(month){
            case "January":
                System.out.println(" First month is January ");
                break;
            case "February":
                System.out.println(" Second month is February ");
                break;
            case "March":
                System.out.println(" Third month is March ");
                break;
            case "April":
                System.out.println(" Fourth month is April ");
                break;
            case "May":
                System.out.println(" Fifth month is May ");
                break;
            case "June":
                System.out.println(" Sixth month is June ");
                break;
            case "July":
                System.out.println(" Seventh month is July ");
                break;
            case "Auguest":
                System.out.println(" Eight month is Auguest ");
                break;
            case "September":
                System.out.println(" Ninth month is September ");
                break;
            case "October":
                System.out.println(" Tenth month is October ");
                break;
            case "November":
                System.out.println(" Eleventh month is November ");
                break;
            case "December":
                System.out.println(" Twelth month is December ");
                break;
            default:
                System.out.println(" Invalid ");
                break;
        }
    }
}
