package factoryMethod;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        carFactory.startVehicle();

        VehicleFactory bikeFactory = new BikeFactory();
        bikeFactory.startVehicle();
    }

}
