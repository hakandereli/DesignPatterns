package designpatterns.structural.decorator;

/**
 * @author hdereli
 * @since 8/31/2023
 */
public class TemelUrun implements Urun {
    private String aciklama;
    private Double fiyat;

    public TemelUrun(String aciklama, Double fiyat) {
        this.aciklama = aciklama;
        this.fiyat = fiyat;
    }

    @Override
    public String aciklama() {
        return aciklama;
    }

    @Override
    public Double fiyat() {
        return fiyat;
    }
}
