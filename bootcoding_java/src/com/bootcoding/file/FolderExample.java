package com.bootcoding.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FolderExample
{
    public static void main(String[] args)
    {
        File jdkFolder = new File("C:\\Program Files\\Java\\jdk-11.0.15");

        if (jdkFolder.isDirectory())
        {
            File[] files = jdkFolder.listFiles();
            for (File file : files)
            {
                System.out.println(file.getPath());
                System.out.println(file.getName());

                if (file.getName().equals("README.html"))
                {
                    try{
                        Scanner scanner = new Scanner(file);
                        System.out.println("file content: ");
                        while (scanner.hasNext())
                        {
                            String line = scanner.nextLine();
                            System.out.println(line);
                        }
                    }
                    catch (IOException e)
                    {

                    }
                }
            }
        }

    }
}
