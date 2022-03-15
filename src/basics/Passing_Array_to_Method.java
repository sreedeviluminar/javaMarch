package basics;

public class Passing_Array_to_Method {

    void add(int x[]){
        int sum = x[0]+x[3]+x[4];
        System.out.println("sum = "+sum);

    }
    public static void main(String[] args) {

        Passing_Array_to_Method obj = new Passing_Array_to_Method();
        int a[] = {1,2,3,4,5};
        obj.add(a);

    }

}
