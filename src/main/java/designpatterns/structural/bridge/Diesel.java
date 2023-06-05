package main.java.designpatterns.structural.bridge;

public class Diesel implements FuelType{
    @Override
    public void start() {
        System.out.println("Dizel ile çalıştırılıyor...");
    }
}
