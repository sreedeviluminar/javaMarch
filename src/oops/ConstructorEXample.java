package oops;

public class ConstructorEXample {
    ConstructorEXample(){
        this(2000);
        System.out.println("inside default constructor");
    }
     ConstructorEXample(int data){

         System.out.println("Inside parameterized constructor data ="+data);
     }

     void show(){
         System.out.println("inside show function");
     }
    public static void main(String[] args) {
         ConstructorEXample obj = new ConstructorEXample();
       //  ConstructorEXample obj1 = new ConstructorEXample(2000);
         //obj.show();
    }
}
