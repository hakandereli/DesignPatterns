
package designpatterns.structural.bridge.goodexample.vehicletypes;


import designpatterns.structural.bridge.goodexample.FuelType;
import designpatterns.structural.bridge.goodexample.Vehicle;

public class Car extends Vehicle {


    public Car(FuelType fuelType) {
        super(fuelType);
    }

    @Override
    public void start() {
        fuelType.start();
    }
}
