package com.bootcoding.Collection;

import com.bootcoding.oops.Book;
import com.bootcoding.oops.Cycle;

import java.util.HashMap;

public class BookCollection
{
    static HashMap<Long, Book> bookStore= new HashMap<>();
    public static void addbook(Book javabook)
    {
        bookStore.put(javabook.getId(),javabook);
    }
    public void  printBook()
    {
        for(Book javabook: bookStore.values())
        {
            System.out.println("Id: " + javabook.getId());
            System.out.println("Title: " + javabook.getTitle());
            System.out.println("Description: " + javabook.getDescription());
            System.out.println("Author: " + javabook.getAuthor());
            System.out.println("PublisherName: " + javabook.getPublisherName());
            System.out.println("Pages: " + javabook.getPages());
        }

    }

    public static void main(String[] args)
    {
        BookCollection bookCollection= new BookCollection();
        for (int i=1; i<=10; i++)
        {
            Book javabook= new Book();
            javabook.setId(i);
            javabook.setTitle("wings of fire ");
            javabook.setDescription("based on rocket science");
            javabook.setAuthor("sawra");
            javabook.setPublisherName("apj abdul kalam");
            javabook.setPages(300);
            bookCollection.addbook(javabook);
        }
        bookCollection.printBook();

    }
}
