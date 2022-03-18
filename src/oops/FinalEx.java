package oops;

public  class FinalEx {
    String name = "Anna";
    int age = 20;
    final long phone = 9122334455l;

    final void display(){
        System.out.println("my name is "+name +" I am "+age+" yrs old , my phone num is  "+phone );
    }
}

class Example extends FinalEx{

    public static void main(String[] args){
        Example obj = new Example();
        obj.display();
    }
}