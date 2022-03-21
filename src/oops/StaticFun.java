package oops;

public class StaticFun {
    void show(){
        System.out.println("inside show function");
    }
    static void display(){
        System.out.println("inside static display function");

    }
    public static void main(String[] args) {
        StaticFun obj = new StaticFun();
        obj.show();
        display();
    }
    static {
        System.out.println("inside static block ");
    }
}
