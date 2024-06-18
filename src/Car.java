public class Car extends Vehicle{

    public Car(String model, String appearance, int yearManufacture, String fuel, double speed, double time){
        super(model, appearance, yearManufacture, fuel, speed, time);
    }

    @Override
    public void model() {
        System.out.println("Car Model: " + this.model);
    }
}
