package basics;

import java.util.Scanner;

public class Mul_Array_Using_Scanner {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("enter row size");
        int row = obj.nextInt();
        System.out.println("enter col size");
        int col = obj.nextInt();

        int num[][]= new int[row][col];
        System.out.println("enter Array "+(row*col)+" elements");

        for (int r =0 ; r<row; r++){

            for(int c = 0 ; c < col ;c++){

                num[r][c] = obj.nextInt();
            }
        }

        System.out.println("The Array is : ");

        for(int r = 0 ;r<row ;r++){

            for(int c = 0; c<col;c++){

                System.out.print(num[r][c]+ " ");
            }
            System.out.println();
        }
    }
}
