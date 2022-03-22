package oops;

interface  Parent7{
    String name = "Neenu";
    int age = 21;
    void display();
    void show();
}
public class InterfaceDemo implements Parent7{
    @Override
    public void display() {
        System.out.println("my name is "+name);
        this.show();
    }
    @Override
    public void show() {
        System.out.println("I am "+age +"yrs old");
    }
    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.display();
    }
}
