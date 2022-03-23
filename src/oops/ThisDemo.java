package oops;

public class ThisDemo {
   private String name= "hello";
   int age;
   String job;

//   ThisDemo(String name, int a){
//       this.name = name;
//       age = a;
//   }
   void display(String j) {
       this.job= j;
   }
    void show(){
        System.out.println("from show function= my name is "+name+" and I am "+age +"years old, I am a "+job );
    }
    public static void main(String[] args) {
      // ThisDemo obj = new ThisDemo("Jeeva",20);
//       obj.display("Student");
//       obj.show();
    }
}
