public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck("Tatra 810 4x4", "Green", 2019, "petrol", 80, 2.3);
        Car car = new Car("Virtus", "Red", 2020, "petrol", 120, 3);
        Motorcycle motorcycle = new Motorcycle("Warrior200", "Yellow", 2002, "petroleum", 80, 1.5);

        truck.model();
        truck.efficiency(119);
        truck.printDistance();
        truck.maxSpeed();

        System.out.println("*******************************************");

        car.model();
        car.efficiency(119);
        car.printDistance();
        car.maxSpeed();

        System.out.println("*******************************************");

        motorcycle.model();
        motorcycle.efficiency(119);
        motorcycle.printDistance();
        motorcycle.maxSpeed();

    }
}