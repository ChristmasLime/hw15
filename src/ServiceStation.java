public class ServiceStation  {
    public void check(VehicleService vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            vehicle.checkEngine();

            if (vehicle.getWheelsCount()>4) {
                Truck.checkTrailer();
            }else{
                System.out.println("Прицепа нет");
            }
        }
    }
}