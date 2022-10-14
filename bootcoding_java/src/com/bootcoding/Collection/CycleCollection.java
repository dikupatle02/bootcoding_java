package com.bootcoding.Collection;

import com.bootcoding.oops.Cycle;
import com.bootcoding.oops.Marker2;

import java.util.HashMap;

public class CycleCollection
{
    static HashMap<Long, Cycle> cycleStore= new HashMap<>();
    public static void addCycle(Cycle c)
    {
        cycleStore.put(c.getId(),c);
    }
    public void  printCycle()
    {
        for(Cycle c : cycleStore.values())
        {
            System.out.println("Id: " + c.getId());
            System.out.println("Company: " + c.getCompany());
            System.out.println("Color: " + c.getWheel());
            System.out.println("Type: " + c.getType());
            System.out.println("Brakes: " + c.getBrakes());
            System.out.println("Brakes: " + c.getPrice());
        }

    }

    public static void main(String[] args)
    {
        CycleCollection cycleCollection= new CycleCollection();
        for (int i=1; i<=10; i++)
        {
            Cycle c= new Cycle();
            c.setId(i);
            c.setCompany("hero " + i);
            c.setWheel(4);
            c.setType("kid cycle" + i);
            c.setPrice(((i+100)*2.5));
            c.setBrakes("dis brake");
            CycleCollection.addCycle(c);
        }
        cycleCollection.printCycle();

    }
}
