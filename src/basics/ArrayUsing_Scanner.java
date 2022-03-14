package basics;

import java.util.Scanner;

public class ArrayUsing_Scanner {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("enter no of students u want to enter");
        int count = obj.nextInt();;

        String names[] = new String[count];
        System.out.println("enter students name");

        for (int i = 0 ; i < count ; i++){

            names[i] = obj.next();
        }
        System.out.println("The name of students : ");

        for (int i =0 ; i<count ;i++){
            System.out.print(names[i]+" ");
        }

    }
}
