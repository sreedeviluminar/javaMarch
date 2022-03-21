package oops;

class Parent5{

    String color="Green";
}
class Child5 extends  Parent5{
    String color = "Blue";
    void show(){
        System.out.println("my favourite color is "+color);
        System.out.println("my seconf fvrt color is "+super.color);
    }
}
public class Super_With_instanceVariable {
    public static void main(String[] args) {
        Child5 obj = new Child5();
        obj.show();
    }
}
