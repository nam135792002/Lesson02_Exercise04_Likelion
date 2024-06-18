public class Vehicle {
    protected String model;
    protected String appearance;
    protected int yearManufacture;
    protected String fuel;

    protected double speed;
    protected double time;

    public Vehicle(String model, String appearance, int yearManufacture, String fuel, double speed, double time) {
        this.model = model;
        this.appearance = appearance;
        this.yearManufacture = yearManufacture;
        this.fuel = fuel;
        this.speed = speed;
        this.time = time;
    }

    public Vehicle(){}

    public void model(){}

    public double distance(){
        return speed * time;
    }

    public void printDistance(){
        System.out.println("Distance Traveled: " + distance() + " miles");
    }

    public void maxSpeed(){
        System.out.println("Max speed: " + speed + " mph");
    }

    public void efficiency(double litConsumer){
        double distance = distance();
        double fuelEfficiency = (litConsumer * 100) /distance;
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " mpg");
    }
}
