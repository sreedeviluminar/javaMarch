package oops;

class Parent4 {
    Parent4() {
        System.out.println("inside Default constructor of parent ");
    }
}
class Child4 extends Parent4{
    Child4(String valuechild){
       // super("MyData");
        System.out.println("inside Default constructor of Child value ="+valuechild);
    }
}
public class Super_with_constructor {
    public static void main(String[] args) {
        Child4 obj = new Child4("mydatachild");
    }
}
