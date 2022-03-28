package pack2;

public class C  implements  Runnable{

    public static void main(String[] args) {

        C obj = new C();
        Thread obj1 = new Thread(obj);
        obj1.start();
    }
    @Override
    public void run() {
        System.out.println("Current Thread is "+Thread.currentThread().getName());

    }
}
