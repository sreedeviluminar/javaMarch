package basics;

public class loopsample {
    public static void main(String[] args) {

        int sumeven = 0;
        int sumodd = 0;

       for (int i = 1 ; i<=10 ;i++){

           if(i % 2 == 0) {

               sumeven += i;

           }else{
               sumodd += i;
           }
       }
        System.out.println("sum of even number = "+sumeven);
        System.out.println("sum of odd number = "+sumodd);
    }
}
