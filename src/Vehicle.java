 public abstract class Vehicle implements VehicleService {
    protected String modelName;
    protected int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

     @Override
     public void service() {
         for (int i = 0; i < wheelsCount; i++) {
             updateTyre();
         }
         }

     @Override
     public String toString() {
         return "Транспортное средство: " + modelName  +
                 " сменить " + wheelsCount +" покрышек.";
     }
 }






