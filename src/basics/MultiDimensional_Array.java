package basics;

public class MultiDimensional_Array {

    public static void main(String[] args) {

        int numbers [][] = new int[3][3];
        int num[][] ={  {1,0,1}, {2,2,2}  };
//        numbers[0][0] = 1;
//        numbers[1][0] = 2;
//        numbers[1][2] = 3;
//
//        numbers[2][0] = 4;
//        numbers[2][1] = 5;
//        numbers[2][2] = 6;

        for(int row = 0 ; row < 2; row++){

            for (int col = 0 ; col < 3 ;col++ ){

                System.out.print(num[row][col]+" ");
            }
            System.out.println();
        }
    }
}
/*
row = 0 0 < 3 true col for loop col = 0  0<3 true  00 = 1
                                col = 1  1<3 true  01 = 0
                                col = 2  2<3 true  11 = 0   1 0 0
                                col = 3  3<3 false exit from col loop new line

row = 1  1 < 3  true col         col = 0 0<3 true  10 = 2
                                 col = 1 1<3 true  11 = 0
                                 col = 2 2<3 true  12 = 3  2 0 3
                                 col = 3 3<3 false  exit from col loop new line

row = 2  2< 3  true col          col = 0 0<3 true  20 = 4
                                 col = 1 1<3 true  21 = 5
                                 col = 2 2<3 true  22 = 6   4 5 6
                                 col = 3 3<3 false exit from col loop
row = 3  3<3  flase exit from row loop

 */