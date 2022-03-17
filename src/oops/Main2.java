package oops;

class GrandFatther{
    String name = "John";
    int age = 70;
    String job = "Farmer";
}
class Father extends  GrandFatther {
    String name1 = "Joby John";
    int age1 = 40;
    String job1 = "Doctor";
}
class Child extends Father{
    String name2 = "Anil Joby John";
    int age2 = 20;
    String job2  = "Student";
}
public class Main2 {
    public static void main(String[] args) {

        Child son = new Child();

        System.out.println("My name is "+son.name2);
        System.out.println("I am "+son.age2+" years Old");
        System.out.println("I am a "+son.job2);
        System.out.println("===============================");
        System.out.println("My father name is "+son.name1);
        System.out.println("My Father is "+son.age1+" years old");
        System.out.println("He is a "+son.job1);
        System.out.println("===============================");
        System.out.println("My Grandfather name is "+son.name);
        System.out.println("He is "+son.age+" years old");
        System.out.println("He is a "+son.job);


    }
}
