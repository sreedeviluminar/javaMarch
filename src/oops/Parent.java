package oops;

public class Parent {
    String name1 = "Paul";
    int age1 = 40;
    String job  ="Engineer";
}
class Child1 extends Parent{ //single inheritance

    String  name = "Anu";
    int age = 12;
    int std = 6;
}
class Child2 extends Parent{

    String  name2 = "Arun";
    int age2 = 8;
    int std2 = 4;
}
class Main{

    public static void main(String[] args) {

        Child1 daughter = new Child1();
        System.out.println("Child name           = "+daughter.name);
        System.out.println("Child age            = "+daughter.age);
        System.out.println("Child studing in     = "+daughter.std+" standard");
//        System.out.println("Child father's name  = "+daughter.name1);
//        System.out.println("Father's Age         = "+daughter.age1);
//        System.out.println("Father's Job is      = "+daughter.job);

        System.out.println("--------------------------------------------");

        Child2 son = new Child2();
        System.out.println("Child name           = "+son.name2);
        System.out.println("Child age            = "+son.age2);
        System.out.println("Child studing in     = "+son.std2+" standard");
        System.out.println("--------------------------------------------");

        System.out.println("Child father's name  = "+son.name1);
        System.out.println("Father's Age         = "+son.age1);
        System.out.println("Father's Job is      = "+son.job);

    }
}