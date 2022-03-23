package oops;

abstract  class MyClass{
    abstract  void show();
}
interface  MYinter{
    void display();
}

//class Demo extends MyClass{
//    @Override
//    void show() {
//        System.out.println("inside override show function");
//    }
//}
public class OuterClass4 {

    public static void main(String[] args) {
        //annonymous innerclass created
        MyClass obj = new MyClass() {
            @Override
            void show() {
                System.out.println("inside overriden show function");
            }
        };
        obj.show();

        MYinter ob = new MYinter() {
            @Override
            public void display() {

            }
        };
        ob.display();

    }
}
