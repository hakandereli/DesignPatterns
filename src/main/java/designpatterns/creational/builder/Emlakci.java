package designpatterns.creational.builder;

public class Emlakci {

    public static void main(String[] args) {

        //Bu örnek SADIK BAHADIR MEMIŞ in youtube kanalından alınmıştır.

        //Yöntem 1
        //Bu yöntemi kullanırsan da zorunlu alanlar olabilir bu class için ve programcı bunu setlemeyi unutabilir boş geçebilir yada hiç bir öz niteliğini doldurmayabilir.
        //Nesne kararsız olmuş olur zorunlu tutamıyorsun bu yöntemde
        Ev ev1 = new Ev();
        ev1.setIl("Ankara");
        ev1.setIlce("YeniMahalle");
        ev1.setMahalle("Demetevler");
        ev1.setOdaSayisi(3);
        ev1.setBinaYili(2020);
        ev1.setHasKlima(true);

        //Yöntem 2
        //Bu yöntemin kötü yanları:
        //1-) örneğin dublex olmayan evleri tanımlarken her seferinde bu evlerin dublex olmadığını belirtmek için false değerini yazman lazım.
        //2-) Ev.java:48 de açıklandı. Parametreleri aynı farklı isimde constructur oluşturamazsın.
        //3-) Bu yöntemde Ev classına ait constructur da hangi sırayla parametleri geçmen gerektiğini bilmen gerekiyor önce il sonra ilçe mahalle gibi bu kod okunurluğunu azaltır.Builder da nokta yı koyunca tüm setler gelir.


        // constructor isimleri özelleştirilebilir mesala yeniDepremYonetmeligineGoreEv() ve eskiDepremYonetmeligineGoreEv() gibi bu kullanımı kolaylaştırır builder kullanılmadı ise her ikisine de ev() denecek.
        // ilerleyen zamanlarda başka bir öznitelik daha eklenmek istenirse(Zorunlu setlenmesi gereken alanlar hariç) constructur değişeceği için bu classı kullananan her sayfada değişikliğe ihtiyaç duyulacaktır.
        //oysa builder kullanılırsa sadece yeni özniteliği kullanmak isteyen sayfalarda değişklik yeterli olacaktır.
        Ev ev2 = new Ev("Ankara", "Çankaya", "Devlet", 2, 1, 1, 1, 2015, false, false, true, false, false);

        printEv(ev1);

        printEv(ev2);
    }

    private static void printEv(Ev ev) {

        System.out.println();

        System.out.println("Ev Eklendi -> " + ev);
    }
}
