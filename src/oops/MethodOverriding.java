package oops;

class Parent1{

    void sum(){
        int sum =10+3+7;
        System.out.println("sum 1= "+sum);
    }
    void sum(int a){
        int sum =a+2;
        System.out.println("sum 3 = "+sum);
    }

    void display(){
        System.out.println("inside display function");
    }
}
public class MethodOverriding  extends  Parent1{
    @Override
    void sum() {
        super.sum();
        int sum =100+30+7;
        System.out.println("sum 2= "+sum);
        super.display();
        //super.sum(200);
    }

//    @Override
//    void sum(int a) {
//        super.sum(a);
//    }
    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.sum();
        //obj.display();
        //obj.sum();

    }

}
