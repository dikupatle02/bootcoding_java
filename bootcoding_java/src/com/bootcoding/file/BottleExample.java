package com.bootcoding.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BottleExample
{
    public static void main(String[] args)
    {
        File file = new File("C:\\data\\bottle.txt");

        try {

                int n = 99;
                FileWriter fw = new FileWriter(file);
                while (n != 0)
                {
                    fw.write(n +" bottles of beer on the wall, " + n +
                            " bottles of beer. " + n +
                            " Take one down and pass it around, " + (n-1) + " 98 bottles of beer on the wall.\n ");
                    n--;

                }
                fw.close();

        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
