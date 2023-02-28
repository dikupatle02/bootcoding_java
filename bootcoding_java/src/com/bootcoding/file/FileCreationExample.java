package com.bootcoding.file;

import java.io.File;

public class FileCreationExample
{
    public static void main(String[] args)
    {
        File file = new File("C://data//data2//data3//folder");
        //creating new folder if not exists
        if (!file.exists())
        {
            //mkdir - creates new folder
            boolean mkdir = file.mkdirs();
        }
    }
}
