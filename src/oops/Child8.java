package oops;

import com.sun.tools.javac.Main;

interface  Father8{
    String parent1 = "Father";
    void fatherdeatils(String name,int age,String job);
}
interface  Mother8{
    String parent2  = "Mother";
    void motherdeatils(String name,int age,String job);
}
public class Child8 implements Father8,Mother8  {
    String child1 = "Boy";
    void childdetails(String name , int std, int age){
            System.out.println(child1+" Child Details");
            System.out.println("Child name = "+name);
            System.out.println("Child age  = "+age);
            System.out.println("Child class= "+std);
    }
    @Override
    public void fatherdeatils(String name, int age, String job) {
        System.out.println(parent1+" Details");
        System.out.println("Father's Name = "+name);
        System.out.println("Father's Age  = "+age);
        System.out.println("Father's Job  = "+job);
    }
    @Override
    public void motherdeatils(String name, int age, String job) {
        System.out.println(parent2+" Details");
        System.out.println("Mother's Name = "+name);
        System.out.println("Mother's Age  = "+age);
        System.out.println("Mother's Job  = "+job);
    }

    public static void main(String[] args) {
        Child8 obj = new Child8();
        obj.childdetails("Appu",5,10);
        System.out.println("===============================");
        obj.fatherdeatils("John",40,"Doctor");
        System.out.println("===============================");
        obj.motherdeatils("Annie",36,"Doctor");
    }
}
