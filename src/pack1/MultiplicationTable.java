package pack1;

public class MultiplicationTable {

   synchronized static void printtable(int num){

       System.out.println("multiplication table of "+num);

           for (int i = 1; i <= 10; i++) {

               System.out.println(num + "*" + i + " = " + (num * i));

               try {
                   Thread.sleep(1000);

               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
   }
}
class Thread1 extends Thread{

   // MultiplicationTable obj;

//    public Thread1(MultiplicationTable obj) {
//
//            this.obj=obj;
//    }
    @Override
    public void run() {
         MultiplicationTable. printtable(2);
    }
}
class Thread2 extends Thread{
  //  MultiplicationTable obj;

//    public Thread2(MultiplicationTable obj) {
//        this.obj= obj;
//    }

    @Override
    public void run() {
        MultiplicationTable.printtable(3);
    }
}
class Thread3 extends Thread{
   // MultiplicationTable obj;

//    public Thread3(MultiplicationTable obj) {
//        this.obj= obj;
//    }

    @Override
    public void run() {
        MultiplicationTable.printtable(5);
    }
}
class Mainnn{
    public static void main(String[] args) {

        //MultiplicationTable obj = new MultiplicationTable();

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}