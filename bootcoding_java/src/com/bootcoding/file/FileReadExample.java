package com.bootcoding.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample
{
    public static void main(String[] args)
    {
        try {

            File file = new File("C://file//file..txt");

            Scanner scanner = new Scanner(file);
            System.out.println("Is File Readable : " + file.canRead());
            System.out.println("Is File Write : " + file.canWrite());
            System.out.println("Is File Execute : " + file.canExecute());
            System.out.println(" File Path : " + file.getPath());
            System.out.println("Absolute File Path : " + file.getAbsolutePath());

            System.out.println("Reading File Contents: ");
            while (scanner.hasNext())
            {
                String line = scanner.nextLine();
                System.out.println(line);
            }


        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
