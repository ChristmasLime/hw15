public class ServiceStation {
    public void check(VehicleService vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            if (vehicle instanceof Bicycle) {
                for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                    vehicle.updateTyre();
                }
            } else {
                for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                    vehicle.updateTyre();
                }
                vehicle.checkEngine();
                if (vehicle instanceof Truck) {
                     vehicle.checkTrailer();
                }
            }
        }
    }
}

