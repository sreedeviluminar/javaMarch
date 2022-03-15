package basics;

public class StringDemoo {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "hello";
        String s3 = new String("Hello");//heap
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.codePointAt(0));
        System.out.println(s2.codePointAt(0));





    }
}
