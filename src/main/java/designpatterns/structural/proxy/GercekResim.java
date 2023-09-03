package designpatterns.structural.proxy;

public class GercekResim implements Resim {

    private String dosyaAdi;

    public GercekResim(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
        yukle();
    }

    private void yukle() {
        System.out.println("Resim Dosyası Yükleniyor : " + dosyaAdi);
    }

    public void goster() {
        System.out.println("Resim Gösteriliyor : " + dosyaAdi);
    }
}
