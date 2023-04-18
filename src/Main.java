

public class Main {
    public static void splitOffers(){
        System.out.println("########################################################################");
    }
    public static void main(String[] args) {
        Vehicle car = new Car("Car1",4);
        Vehicle car2 = new Car("Car2",4);

        Vehicle truck = new Truck("truck1",6);
        Vehicle truck2 = new Truck("truck2",8);

        Vehicle bicycle = new Bicycle("bicycle1",2);
        Vehicle bicycle2 = new Bicycle("bicycle2",2);


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
        Vehicle[]  stations = new Vehicle[]{car,car2,truck,truck2,bicycle,bicycle2};
        for (Vehicle vehicle : stations) {

            System.out.println(vehicle);
        }
//        station.checkAll(stations);

    }
}