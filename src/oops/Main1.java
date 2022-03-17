package oops;
class  Car{
    void details(String color,int seatingcapacity, String fuel, double milage){
        System.out.println("My car Color is "+color);
        System.out.println("My Car is "+seatingcapacity+ " Seater");
        System.out.println("My car is "+fuel+" Engine");
        System.out.println("My car has a milage of "+milage+ "km/ltr");
    }
}
class Maruti extends  Car{
    String model = "Swift Dzire";
}
class BMW extends  Car{
    String model ="X1";
}
public class Main1 {
    public static void main(String[] args) {

        Maruti maruti = new Maruti();
        System.out.println("My car Model is "+maruti.model);
        maruti.details("White",5,"Petrol",16.7);
        System.out.println("=============================");
        BMW bmw = new BMW();
        System.out.println("My car Model is BMW "+bmw.model);
        bmw.details("Black",5,"Petrol",13.2);


    }
}
