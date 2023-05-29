package designpatterns.behavioural.observer;

public interface Observer {
    //Takipçiye bildirim yollamak video yüklendi
    void update();

    //Takipçi kanalı takip etti.
    void subscribeChannel(Channel ch);
}
