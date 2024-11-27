package creationalPatterns.factoryMethod;

public abstract class VehicleFactory {

    //fabric method
    public abstract Vehicle createVehicle();

    //use created product
    public void startVehicle(){
        Vehicle  vehicle = createVehicle();
        vehicle.drive();
    }
}
