package designpatterns.structural.adapter;

public class Test {
    public static void main(String[] args) {
        //Bu örnek sadık bahadır memişin youtube videosundan alınmıştır.

        //Adapter design pattern uyumsuz interfaceleri kullanmamızı sağlar.
        //Aşağıdaki örnekte normal evlere gelen 220v a utu ve buzdolabı takılırken
        //telefonu takamayız bu yüzden adaptöre ihtiyacımız olduğu örneği verilmiştir.
        //Telefonu sarş etmek için prizi değiştirmeden bir adaptör ekleyerek 220v u 5 v a düşürebiliriz.

        //Adaptör de kullanmak istediğin interface i implement eder methodunu ezersin.
        //Kendi yaptırmak istediğin yeni durumu bu ezdiğin metoda yazarsın.
        //Böylece var olan yapıyı değiştirmeden yeni bir class ekleyerek sorunu çözmüş olursun.

        //Bunu şöyle düşün xml ile bir servisten veri alıp gene xml ile bir yere veri paylaşıyorsun ama paylaştığın kurum
        // bunu xml e artık gönderme bize json ile gönder dedi ama tek tüketici bu değil başka tüketicilerde var.
        // burada adapter tasarım kalıbını kullanarak eski yapıyı bozmadan adama paylaşacağın adrese verileri
        //xml yerine json ile gönder diyebilirsin.
        Priz priz = new Priz();
        Utu utu = new Utu();

        Buzdolabi buzdolabi = new Buzdolabi();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabi);


        SamsungTelefon samsungTelefon = new SamsungTelefon();
        //Aşağıdaki metodu kullanamassın adaptörün yok prizi değiştirmeden telefonu sarj etmek için adaptör eklemen lazım.
//        priz.elektrikVer(samsungTelefon);

        TelefonEEAAdapter telefonEEAAdapter = new TelefonEEAAdapter(samsungTelefon);
        priz.elektrikVer(telefonEEAAdapter);
    }
}
