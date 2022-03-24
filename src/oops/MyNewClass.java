package oops;

public class MyNewClass {
    public static void main(String[] args) {
        EncapsulatedClass obj = new EncapsulatedClass();
        obj.setName("Arjun");
        obj.setAge(23);
        obj.setJob("Student");
       System.out.println( obj.getName());
       System.out.println( obj.getAge());
       System.out.println( obj.getJob());
    }
}
