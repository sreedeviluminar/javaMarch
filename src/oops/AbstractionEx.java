package oops;
abstract class Parent6 {
    String name;
    int age ;
    abstract void show();
    void display(){
       System.out.println("inside display function");
   }
}
public class AbstractionEx extends Parent6{

    @Override
    void show() {
        super.display();
        System.out.println("inside display function");
        System.out.println("my name is "+(name="Anna")+" and am "+(age = 20)+"yrs old");
    }
    public static void main(String[] args) {
        AbstractionEx obj = new AbstractionEx();
        obj.show();
       // obj.display();
    }
}
