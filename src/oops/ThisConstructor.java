package oops;

public class ThisConstructor {

    ThisConstructor(){
        this(1);
        System.out.println("inside default constructor");
    }
    ThisConstructor(int a){
        this(10,20);
        System.out.println("inside parameterized constructor with "+a+" argument");
    }
    ThisConstructor(int a,int b){
        System.out.println("inside parameterized constructor with sum = "+(a+b));
    }
    public static void main(String[] args) {

        ThisConstructor obj = new ThisConstructor();

    }
}
