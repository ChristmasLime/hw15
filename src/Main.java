import java.util.Arrays;

public class Main {
    public static void splitOffers(){
        System.out.println("########################################################################");
    }
    public static void main(String[] args) {
        Car car = new Car("Car1",4);
        Car car2 = new Car("Car2",4);

        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);

        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);


        ServiceStation station = new ServiceStation();

        splitOffers();
        station.check(car);
        splitOffers();
        station.check(car2);
        splitOffers();
        station.check(bicycle);
        splitOffers();
        station.check(bicycle2);
        splitOffers();
        station.check(truck);
        splitOffers();
        station.check(truck2);
        splitOffers();

    }
}