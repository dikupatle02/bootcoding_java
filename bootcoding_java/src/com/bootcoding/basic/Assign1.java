package com.bootcoding.basic;

public class Assign1
{

     String name;
     int chem;
     int phy;
     int maths;
     int bio;
     int Average;
     int Percentage;

    public int getAverage() {
        return Average;
    }

    public void setAverage(int average) {
        Average = average;
    }

    public int getPercentage() {
        return Percentage;
    }

    public void setPercentage(int percentage) {
        Percentage = percentage;
    }

    public int getBio() {
        return bio;
    }

    public void setBio(int bio) {
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public static void main(String[] args)
    {
        Assign1 a1=new Assign1();
        a1.setName("diku");
        a1.setBio(78);
        a1.setChem(67);
        a1.setMaths(70);
        a1.setPhy(69);
    }

}


