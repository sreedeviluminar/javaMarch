package extras;

public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("welcome to java programming");
   try{
        int div = 10/0;
        System.out.println("div out = "+div);

        String name = null;
        System.out.println(name.length());

        int a[] = {1, 2, 3, 4};
        System.out.println(a[4]);

    }catch (NullPointerException e){
        System.out.println("Exception occured "+e);
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Exception occured "+e);
    }catch (Exception e){
        e.printStackTrace();
 }

    System.out.println("Thank You!!!!!!!!!!!!");

    }
}
