package oops;

public class OuterClass {
    //outer class instance variables
    String name="anna";
    int age=20;
    //outer class fun
    void show(){
        System.out.println("inside show function of outer class");
    }
    //instance innerclass
    class Inner{
      //instance variable of inner class
        String job = "student";
       //innerclass function
        void display(){
            System.out.println("my name is "+name+" and i am "+age +" yrs old , I am a "+job);
        }
    }
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.show();
        Inner objinner =obj.new Inner();
        objinner.display();



    }
}
