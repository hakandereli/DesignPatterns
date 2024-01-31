package designpatterns.structural.bridge.goodexample.vehicletypes;

import designpatterns.structural.bridge.goodexample.FuelType;
import designpatterns.structural.bridge.goodexample.Vehicle;

public class Truck extends Vehicle {

    public Truck(FuelType fuelType) {
        super(fuelType);
    }

    @Override
    public void start() {
        fuelType.start();
    }
}
