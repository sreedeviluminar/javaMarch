package oops;

public class ThisDemo {
   String name;
   int age;
   String job;

   ThisDemo(String n, int a){
       name = n;
       age = a;
   }
   void display(String job) {
       this.job= job;
   }
    void show(){
        System.out.println("from show function= my name is "+name+" and I am "+age +"years old, I am a "+job );
    }
    public static void main(String[] args) {
       ThisDemo obj = new ThisDemo("Jeeva",20);
       obj.display("Student");
       obj.show();
    }
}
