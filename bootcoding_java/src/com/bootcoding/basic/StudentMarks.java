package com.bootcoding.basic;

public class StudentMarks
{
    public static void main(String[] args)
    {
        StudentMarks sm = new StudentMarks();
        Assign1 a = sm.Convert("Ramesh,76,65,88,80");
        System.out.println("Average Marks: " + a.getAverage());
        System.out.println("Percentage: " + a.getPercentage());
    }


    public Assign1 Convert(String text)
    {

        String[]tokens=text.split(",");
        Assign1 student =new Assign1();
        student.setName(tokens[0]);
        student.setPhy(Integer.parseInt(tokens[1]));
        student.setChem(Integer.parseInt(tokens[2]));
        student.setMaths(Integer.parseInt(tokens[3]));
        student.setBio(Integer.parseInt(tokens[4]));

        int totalMarks = student.getPhy() + student.getChem() + student.getMaths() + student.getBio();

        student.setAverage(totalMarks/4);
        student.setPercentage((totalMarks * 100)/400);
        return student;


    }
}
