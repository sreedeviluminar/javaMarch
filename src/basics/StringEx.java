package basics;

public class StringEx {

    public static void main(String[] args) {

        char myarray[] = {'h','e','l','l','o'};
        System.out.println(myarray);

        //string literal method
        String name1 = "Anna";
        //string new keyword
        String name2 = new String("John");

        name2.concat(" Paul");
        System.out.println("name1= "+name2);

        StringBuffer name3 = new StringBuffer("Hari");
        name3.append(" Haran");
        System.out.println("name3 = "+name3);
        //System.out.println(name3.reverse());
       // System.out.println(name3.replace(0,5," govind"));

    }
}
