package oops;

public class MethodOverloading {

    void add(){ //default function
        int sum = 10+20;
        System.out.println("sum = "+sum);
    }
    void add(int a, int b){
        int sum = a+b;
        System.out.println("sum2 = "+sum);
    }
    void add(int a, int b,int c){
        int sum = a+b+c;
        System.out.println("sum3 = "+sum);
    }
    void add(String name , int age){

        System.out.println("my name is "+name +" and I am "+age+"years old" );
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add("Anna" ,20);
        obj.add();
        obj.add(10,1);
        obj.add(1,2,3);
    }
}
