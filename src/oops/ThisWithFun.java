package oops;

public class ThisWithFun {
    void add(){
        int sum = 10+3;
        System.out.println("sum = "+sum);
        this.add(12,3);
        this.show();
    }
   void add(int a, int b){
       int sum = a+b;
       System.out.println("sum1 = "+sum);
   }
   void show(){
        int sum = 20+4+6;
        System.out.println("sum2 = "+sum);

   }
    public static void main(String[] args) {
        ThisWithFun obj = new ThisWithFun();
        obj.add();

    }
}
