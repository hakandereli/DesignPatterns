package designpatterns.behavioural.observer;

public class Youtube {

    //Observable izlenebilir demektir.
    //Observer ise izleyici izleyen demektir.
    //Bu patterni anlamak için youtube ve kanallardaki takipçilere yeni bildirim geldiğinde otomatik bildirim gitmesi
    // güzel bir örnektir.
    //Bu pattern esnek bağlılığı sağlar bir sınıf değiştiğinde diğer sınıfların değişmesi azalır veya yoktur.
    //gözlemci istediği subjecti izler veya bırakabilir.
    public static void main(String[] args) {

        Channel inJavaTrustTv= new Channel();

        //Kullanıcılar Youtube a üye oldu
        Subscriber s1 = new Subscriber("Hakan");
        Subscriber s2 = new Subscriber("Osman");
        Subscriber s3 = new Subscriber("Hasan");
        Subscriber s4 = new Subscriber("Besim");
        Subscriber s5 = new Subscriber("Onur");

        //Kullanılıcılar injavaTrustTv kanalını takip etti.
        inJavaTrustTv.subscribe(s1);
        inJavaTrustTv.subscribe(s2);
        inJavaTrustTv.subscribe(s3);
        inJavaTrustTv.subscribe(s4);
        inJavaTrustTv.subscribe(s5);

        inJavaTrustTv.unSubscribe(s3);

        s1.subscribeChannel(inJavaTrustTv);
        s2.subscribeChannel(inJavaTrustTv);
        s3.subscribeChannel(inJavaTrustTv);
        s4.subscribeChannel(inJavaTrustTv);
        s5.subscribeChannel(inJavaTrustTv);


        inJavaTrustTv.upload("Java 17 NEWS");

    }
}