package oops;

public class ConstructorEXample {
    ConstructorEXample(){
        System.out.println("inside default constructor");
    }
     ConstructorEXample(int data){
         System.out.println("Inside parameterized constructor data ="+data);
     }
     ConstructorEXample(String name , int age){
         System.out.println("Inside parameterized constructor name = "+name+" age ="+age);
     }
     void show(){
         System.out.println("inside show function");
     }
    public static void main(String[] args) {
         ConstructorEXample obj = new ConstructorEXample();
         ConstructorEXample obj1 = new ConstructorEXample(2000);
         ConstructorEXample obj2 = new ConstructorEXample("Sarika",32);
         obj.show();
    }
}
