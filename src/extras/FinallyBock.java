package extras;

public class FinallyBock {

    public static void main(String[] args) {

        System.out.println("welcome to java programming");

        try {
            int div = 10 / 0;
            System.out.println(div );
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exception occured "+e);
        }finally {
            System.out.println("Finally block is always Executed");
        }
        System.out.println("Thank You!!!!!!!!!!!!");


    }
}
