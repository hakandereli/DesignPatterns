package designpatterns.structural.bridge;

public abstract class Vehicle {

    protected FuelType fuelType;

    public Vehicle(FuelType fuelType){
        this.fuelType = fuelType;
    }

    public abstract void start();
}
