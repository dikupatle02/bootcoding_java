package com.bootcoding.Collection;

import com.bootcoding.oops.Marker2;

import java.util.HashMap;
import java.util.Random;

public class MarkerCollection
{
    HashMap<Long, Marker2> markerStore= new HashMap<>();
    public void addMarker(Marker2 m)
    {
        markerStore.put(m.getId(),m);
    }
    public void  printMarkers()
    {
        for(Marker2 m : markerStore.values())
        {
            System.out.println("Id: " + m.getId());
            System.out.println("Company: " + m.getCompany());
            System.out.println("Color: " + m.getColor());
            System.out.println("Type: " + m.getType());
            System.out.println("Price: " + m.getPrice());
        }

    }

    public static void main(String[] args)
    {
        String[] colors ={"Black","Blue","Red","Green","Orange"};

        Random random = new Random();
        MarkerCollection markerCollection= new MarkerCollection();
        for (int i=1; i<=100; i++)
        {
            int randomIndex = random.nextInt(colors.length);
            Marker2 m= new Marker2();
            m.setId(i);
            m.setCompany("Camlin " + i);
            m.setColor(colors[randomIndex]);
            m.setType("WhiteB" + i);
            m.setPrice((i+100)*2.5);
            markerCollection.addMarker(m);
        }
        markerCollection.printMarkers();

    }
}


