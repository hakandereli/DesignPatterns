
package designpatterns.structural.bridge;


public class Car extends Vehicle{


    public Car(FuelType fuelType) {
        super(fuelType);
    }

    @Override
    public void start() {
        fuelType.start();
    }
}
