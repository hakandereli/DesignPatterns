package designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    //Youtube kanalınında takipçileri olsun.
    //Bir de yüklenen içerik başlığı
    private List<Subscriber> subs = new ArrayList<>();
    private String videoTittle;

    //Takipçi ekleme
    @Override
    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }

    //Takipten çıktı
    @Override
    public void unSubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    //Takipçilere bildirim yolla
    @Override
    public void notifySubscribers() {

        for (Subscriber sub : subs) {
            sub.update();
        }
    }

    @Override
    public void upload(String videoTittle){
        this.videoTittle = videoTittle;
        notifySubscribers();
    }


    public String getVideoTittle() {
        return videoTittle;
    }

    public void setVideoTittle(String videoTittle) {
        this.videoTittle = videoTittle;
    }
}
