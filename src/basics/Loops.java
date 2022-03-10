package basics;

public class Loops {
    public static void main(String[] args) {
//        //for loop
//
//        for( int i =1; i <= 10 ; i++){
//
//            System.out.println("Hello");
//        }
////while
//        int j = 1;
//        while( j <= 5){
//            System.out.println("Hello");
//            j++;
//        }

        //do while
        int k = 0;
        do{
            System.out.println("Hello");
            k++;
        }while (k == 3);

   }
}
/*
* i = 1  1<= 10 true  print hello i++ = 2
* i = 2  2<=10  true  print hello
* ...................   i++ = 10
* i = 10 10<=10  true print hello i++ = 11
* i = 11 11<=10  false exit from the loop
* */