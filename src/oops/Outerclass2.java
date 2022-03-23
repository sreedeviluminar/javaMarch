package oops;

public class Outerclass2 {

    //outer class instance variables
    static String name="anna";
    static int age=20;

    static  class InneClass2{

      void show(){
            System.out.println("My name is "+name+"and I am "+age +" yrs old");
        }
    }

    public static void main(String[] args) {
        InneClass2 obj = new InneClass2();
        obj.show();
        System.out.println(name);

    }
}
