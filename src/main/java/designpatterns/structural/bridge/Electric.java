package designpatterns.structural.bridge;

public class Electric implements FuelType{
    @Override
    public void start() {
        System.out.println("Electric ile çalıştırılıyor...");
    }
}
