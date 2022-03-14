package basics;

import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {
        //nextXYZ();

        Scanner  obj = new Scanner(System.in);
        System.out.println("enter your name");
        String name = obj.next();
        System.out.println("enter your age");
        int age = obj.nextInt();
        System.out.println("enter your gender");
        char gender = obj.next().charAt(0); //male   female
        System.out.println("enter your phone");
        long phone = obj.nextLong();

        System.out.println("Student Details");
        System.out.println("Name      = "+name);
        System.out.println("Age       = "+age);
        System.out.println("Gender    = "+gender);
        System.out.println("Phone     = "+phone);

    }
}
