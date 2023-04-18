public class ServiceStation {
        public void check(VehicleService vehicle) {
                vehicle.service();
        }

        public void checkAll(VehicleService[] vehicles) {
                for (VehicleService vehicle : vehicles) {
                        vehicle.service();
                }
        }
}






//
//        if (vehicle != null) {
//            System.out.println("Обслуживаем " + vehicle.getModelName());
//
//                for (int i = 0; i < vehicle.getWheelsCount(); i++) {
//                vehicle.updateTyre();
//                }
//                vehicle.checkEngine();
//                vehicle.checkTrailer();
//
//                }
//            }
