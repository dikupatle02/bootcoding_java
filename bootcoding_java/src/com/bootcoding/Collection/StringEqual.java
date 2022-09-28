package com.bootcoding.Collection;

public class StringEqual
{
    public static void main(String[] args)
    {
        String s1="BootCoding";
        String s2=new String("BootCoding");
        String s3="BootCoding";

        if(s1==s2)
        {
            System.out.println("Reference of s1 & s2 are same");
        }
        else
        {
            System.out.println("Reference of s1 & s2 are not same");
        }
        if(s1.equals(s2))
        {
            System.out.println("Contents of s1 & s2 are same");
        }
        else
        {
            System.out.println("Contents of s1 & s2 are not same");
        }
        if(s1==s3)
        {
            System.out.println("Reference of s1 & s3 are same");
        }
        else
        {
            System.out.println("Reference of s1 & s3 are not same");
        }
    }

}
