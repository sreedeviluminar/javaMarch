package basics;

public class sample{
    public static void main(String[] args) {
        int a = 10, b = 20, c = 12;

        String result = (a > b) ? (a > c  ? a+" is larger":c+" is larger") : (b > c ? b+" is larger":c+" is larger");
        System.out.println(result);
    }
}
