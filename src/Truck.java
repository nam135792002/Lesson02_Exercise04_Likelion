public class Truck extends Vehicle{

    public Truck(String model, String appearance, int yearManufacture, String fuel, double speed, double time){
        super(model, appearance, yearManufacture, fuel, speed, time);
    }

    @Override
    public void model() {
        System.out.println("Truck Model: " + this.model);
    }
}
