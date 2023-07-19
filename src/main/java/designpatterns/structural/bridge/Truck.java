package designpatterns.structural.bridge;

public class Truck extends Vehicle{

    public Truck(FuelType fuelType) {
        super(fuelType);
    }

    @Override
    public void start() {
        fuelType.start();
    }
}
