package designpatterns.structural.bridge.goodexample.fueltypes;

import designpatterns.structural.bridge.goodexample.FuelType;

public class Diesel implements FuelType {
    @Override
    public void start() {
        System.out.println("Dizel ile çalıştırılıyor...");
    }
}
