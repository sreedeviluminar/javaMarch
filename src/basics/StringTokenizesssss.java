package basics;

import java.util.StringTokenizer;

public class StringTokenizesssss {
    public static void main(String[] args) {

//        StringTokenizer  data  = new StringTokenizer("hello all , welcome to java class at, luminar technolab" , "l");
//
//        while (data.hasMoreTokens()){
//            System.out.println(data.nextToken());
//        }


        String data ="hello all welcome to java class at luminar technolab";
        String myarray[] = data.split(" ");

        for(String names : myarray){  // for each loop

            System.out.println(names);

        }
    }
}
