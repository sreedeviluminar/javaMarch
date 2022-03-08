package basics;
public class LocalVariables {
    //returntype functionname(){....}
    void add(){     //function without returnType
        //local variables
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println("sum = "+sum);
    }
    int sub(){ //function with returnType
        int a = 300 , b = 50;
        int sub = a-b;
        System.out.println("sub = "+sub);
        return a;
    }

   //main function
    public static void main(String[] args) {
      LocalVariables obj = new LocalVariables();
      obj.add();
      int a = obj.sub();
      System.out.println("a = "+a);
    }
}
