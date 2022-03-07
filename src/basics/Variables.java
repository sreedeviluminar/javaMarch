package basics;

public class Variables {
    //instance varibale (always depends on object)
    String name;
    int age;
    long phone;

   //static variables (depends on class)
    static  String course ="Android";

    public static void main(String[] args) {

        Variables student1 = new Variables(); // classname objectname = newkeyword constructor();
        System.out.println("Student 1 Details");
        System.out.println("Name     = "+(student1.name= "Arun"));
        System.out.println("Age      = "+(student1.age= 20));
        System.out.println("Phone    = "+(student1.phone =9876543210l));
        System.out.println("Course   = "+course);

        System.out.println("---------------------------------------");

        Variables student2 = new Variables();
        System.out.println("Student 2 Details");
        System.out.println("Name     = "+(student2.name= "Anitha"));
        System.out.println("Age      = "+(student2.age= 21));
        System.out.println("Phone    = "+(student2.phone =98777675210l));
        System.out.println("Course   = "+course);

        System.out.println("---------------------------------------");

        Variables student3 = new Variables();
        System.out.println("Student 3 Details");
        System.out.println("Name     = "+(student3.name= "Bibin"));
        System.out.println("Age      = "+(student3.age= 22));
        System.out.println("Phone    = "+(student3.phone =000000000l));
        System.out.println("Course   = "+(course ="BigData"));

        System.out.println("---------------------------------------");


        System.out.println("Name     = "+(student1.name));
        System.out.println("Name     = "+(student2.name));
        System.out.println("Name     = "+(student3.name));
        System.out.println("course = "+course);

    }
}
