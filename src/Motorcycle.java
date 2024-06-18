public class Motorcycle extends Vehicle{

    public Motorcycle(String model, String appearance, int yearManufacture, String fuel, double speed, double time){
        super(model, appearance, yearManufacture, fuel, speed, time);
    }

    @Override
    public void model() {
        System.out.println("Motorcycle Model: " + this.model);
    }
}
