package designpatterns.structural.proxy;

public class ProxyResim implements Resim{

    private GercekResim gercekResim;
    private String dosyaAdi;

    public ProxyResim(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    @Override
    public void goster() {
        if (gercekResim == null){
            gercekResim = new GercekResim(dosyaAdi);
        }
        gercekResim.goster();
    }
}
