package com.bootcoding.collection1;

public class User {    //implements Comparable<User>
    private String name;
    private int age;
    private long phoneno;
    public User(String name, int age, long phoneno) {
        this.name = name;
        this.age = age;
        this.phoneno = phoneno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneno=" + phoneno +
                '}';
    }
  //  @Override
   // public int compareTo(User user) {
     //   if (this.getAge()> user.getAge())
        //    return 1;
     //   else
        //    return -1;

   // }

}
