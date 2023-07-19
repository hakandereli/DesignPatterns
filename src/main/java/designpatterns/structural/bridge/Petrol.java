package designpatterns.structural.bridge;

public class Petrol implements FuelType{
    @Override
    public void start() {
        System.out.println("Benzinle ile çalıştırılıyor...");
    }
}
