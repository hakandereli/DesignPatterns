package designpatterns.behavioural.observer;

public class Subscriber implements Observer {

    //Bir takipçinin ismi ve takip ettiği kanal olsun.
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    //Takipçiye bildirim yollamak video yüklendi
    @Override
    public void update(){
        System.out.println("Hey " + name + ",  Video Uploaded: " + channel.getVideoTittle());
    }

    //Takipçi kanalı takip etti.
    @Override
    public void subscribeChannel(Channel ch){
        channel = ch;
    }


}
