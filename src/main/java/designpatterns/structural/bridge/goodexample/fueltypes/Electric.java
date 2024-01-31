package designpatterns.structural.bridge.goodexample.fueltypes;

import designpatterns.structural.bridge.goodexample.FuelType;

public class Electric implements FuelType {
    @Override
    public void start() {
        System.out.println("Electric ile çalıştırılıyor...");
    }
}
