package oops;

public class OuterClass1 {

    void show(){
        //c is local variable
        int c = 30;
        //local inner class
        class LocalInner{
            // a and b are instance variable of local inner class
            int a= 20;
            int b= 10;
           //function of local inner class
            void add(){
                System.out.println("sum = "+(a+b+c));
            }
        }
        LocalInner obj= new LocalInner();
        obj.add();
  }//show function closed

    public static void main(String[] args) {
        OuterClass1 obj = new OuterClass1();
        obj.show();
    }

}
