package pack1;

public class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Current Thread is "+Thread.currentThread().getName());
    }
    public static void main(String[] args) { //builtin thread priority = 5

        ThreadDemo objthread1 = new ThreadDemo();
        ThreadDemo objthread2 = new ThreadDemo();
        ThreadDemo objthread3 = new ThreadDemo();

        objthread1.setName("T1");
        objthread2.setName("T2");
        objthread3.setName("T3");

        objthread1.setPriority(10);

        objthread1.start();
        objthread2.start();
        objthread3.start();



    }
}
