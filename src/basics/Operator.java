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
    }
}
