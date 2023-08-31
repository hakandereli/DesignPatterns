package designpatterns.structural.decorator;

public class Main {

    /**
     * Decorator tasarım kalıbı, nesne odaklı programlamada kullanılan ve bir nesnenin davranışını dinamik olarak
     * genişletmeyi sağlayan bir tasarım kalıbıdır.
     * Bu kalıp, nesne üzerindeki değişikliklerin alt sınıfların oluşturulmasına gerek kalmadan yapılmasını sağlar.
     * Bu sayede kod tekrarı azalır, esneklik artar ve açık kapalı prensibine uygunluk sağlanır.
     *
     * Decorator tasarım kalıbı genellikle bir nesneye ek fonksiyonellik veya özellikler eklemek gerektiğinde kullanılır.
     * Örneğin, bir nesnenin üzerine dinamik olarak çeşitli süslemeler veya özellikler eklemek istediğinizde bu
     * kalıp kullanışlı olabilir.
     *
     Bir e-ticaret uygulamasında ürünlerin indirimli fiyatlarını gösteren bir özellik eklemek istiyoruz.
     Ancak bu indirimli fiyatın yanı sıra bazı ürünlerde ekstra özellikler de göstermek istiyoruz.
     Ancak her ürünün farklı indirim oranları ve ekstra özellikleri olabilir.
     *
     * */

    public static void main(String[] args) {
        Urun temelUrun = new TemelUrun("Çanta", 100.0);
        Urun indirimliUrun = new IndirimDecorator(temelUrun, 0.2);
        Urun ekstraOzellikliUrun = new EkstraOzellikDecorator(indirimliUrun, "Deri");

        System.out.println("Ürün: " + ekstraOzellikliUrun.aciklama());
        System.out.println("Fiyat: " + ekstraOzellikliUrun.fiyat());
    }
}
