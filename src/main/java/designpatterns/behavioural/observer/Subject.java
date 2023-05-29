package designpatterns.behavioural.observer;

public interface Subject {
    //Takipçi ekleme
    void subscribe(Subscriber sub);

    //Takipten çıktı
    void unSubscribe(Subscriber sub);

    //Takipçilere bildirim yolla
    void notifySubscribers();

    void upload(String videoTittle);
}
