package com.bootcoding.file;

import java.io.File;

public class FileDeleteExample
{
    public static void main(String[] args)
    {
        File file = new File("C://data//data2//data3//folder");
        //creating new folder if not exists
        if (file.exists())
        {
            file.delete();
        }
    }
}
