package designpatterns.structural.bridge.badexample;

public class Vehicle2 {
    private String fuelType;

    public Vehicle2(String fuelType) {
        this.fuelType = fuelType;
    }

    public void start() {

        if ("petrol".equals(fuelType)) {

            System.out.println("Benzinle çalıştırılıyor...");

        } else if ("diesel".equals(fuelType)) {

            System.out.println("Dizel ile çalıştırılıyor...");

        } else if ("electric".equals(fuelType)) {

            System.out.println("Elektrik ile çalıştırılıyor...");

        }
    }

//    Bu yaklaşım, taşıtların yakıt türleri için bir dizi "if-else" ifadesi kullanır.
//    Her yeni yakıt türü eklemek için sınıfı değiştirmek gerekir, bu da tasarımın genişletilebilirliğini azaltır ve
//    karmaşık hale getirir.
}
