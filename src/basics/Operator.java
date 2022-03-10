package basics;
public class Operator {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
//arithmetic operator
        System.out.println("a+b = "+(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+(a/b));
        System.out.println("a%b = "+(a%b));

        System.out.println("----------------------------");
//assignment operator
        System.out.println("a=b => "+(a=b));//a= 20
        System.out.println("a+=b = "+(a+=b));//a=a+b = 20 + 20 =40
        System.out.println("a-=b = "+(a-=b));//a=a-b = 40 - 20 =20
        System.out.println("a*=b = "+(a*=b));
        System.out.println("a/=b = "+(a/=b));
        System.out.println("a%=b = "+(a%=b));

        System.out.println("----------------------------");
 //unary postfix - (post incr & post decr) , prefix(pre incr  & pre dec)
        int c = 100;
        System.out.println("c++ = "+(c++));//postincre   100   c+1 = 100+1 =101
        System.out.println("c-- = "+(c--));//postdecre   101   c-1 = 101-1 =100
        System.out.println("++c = "+(++c));//preincre    101
        System.out.println("--c = "+(--c));//predecre    100

        System.out.println("----------------------------");
//relational operator
        int x = 20;
        int y = 16;
        System.out.println("x==y = >"+(x==y));
        System.out.println("x!=y = >"+(x!=y));
        System.out.println("x >y = >"+(x>y));;
        System.out.println("x <y = >"+(x==y));
        System.out.println("x>=y = >"+(x>=y));
        System.out.println("x<=y = >"+(x<=y));

//logical operator
        System.out.println("----------------------------");
        System.out.println(x != y &&  x < y && x == y);// true  && false => true

        System.out.println("----------------------------");
//shift
        int z = 10;// 0000 1010
        System.out.println("z >>  1 => "+(z >> 1)); //0000 1010  >> 1   0000 0101 =5
        System.out.println("z <<  2 => "+(z << 2)); //0000 1010  << 2   0010 1000

        System.out.println("----------------------------");
//bitwise
        int a1 =  11 ; //1011
        int a2 =  15 ; //1111
           //a1  & a2 =  1011 = 11
          // a1  | a2 =  1111 = 15
        //   a1  ^ a2 =  0100 = 4
         System.out.println(a1 & a2);
        System.out.println(a1 | a2);
        System.out.println(a1 ^ a2);
        System.out.println("----------------------------");

//ternary  -> condition ? true statement :  false statement ;
        boolean out = (a1 > a2) ? true : false;
        System.out.println("result = "+out);
    }
}
