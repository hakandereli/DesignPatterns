package designpatterns.structural.bridge.goodexample.fueltypes;

import designpatterns.structural.bridge.goodexample.FuelType;

public class Petrol implements FuelType {
    @Override
    public void start() {
        System.out.println("Benzinle ile çalıştırılıyor...");
    }
}
