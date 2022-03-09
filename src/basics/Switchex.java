package basics;

public class Switchex {

    public static void main(String[] args) {
        int month = 5;

        switch (month){
            case  1:
                System.out.println("Month is jan");
                break;
            case 2 :
                System.out.println("Month is Feb");
                break;
            case 5 :
                System.out.println("Month is May");
                break;
            case 12 :
                System.out.println("Month is dec");
                break;
            default:
                System.out.println("none of these");
        }


    }
}
