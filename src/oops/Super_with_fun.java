package oops;

class  Parent3{
    void method1(){
        System.out.println("inside method 1");
    }
    void method1(int a){
        System.out.println("inside overloaded method 1 with a = "+a);
    }
    void method2(){
        System.out.println("inside method 2");
    }
}
class Child3 extends  Parent3{
    @Override
    void method1() {
//        super.method1();
          System.out.println("inside overrided method 1");
//        super.method1(40);
//        super.method2();
   }
   void show(){
        super.method1();
        super.method1(20);
        super.method2();
   }
}
public class Super_with_fun {

    public static void main(String[] args) {

        Child3 obj = new Child3();
        obj.method1();
        obj.show();
//        obj.method1(40);
//        obj.method2();

    }
}
