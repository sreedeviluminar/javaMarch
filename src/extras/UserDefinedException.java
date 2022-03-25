package extras;

class MyException extends  Exception{
    MyException(String s){
        super(s);
    }
}
public class UserDefinedException {

    static void check(int age) throws MyException,ArithmeticException {

        if (age < 18 ){

            throw  new MyException("Age is not valid for vote");

        } else {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String[] args) {

        try {
            check(0);
        } catch (MyException e) {
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

    }
}
