package designpatterns.structural.decorator;

/**
 * @author hdereli
 * @since 8/31/2023
 */
public class IndirimDecorator extends UrunDecorator {

    private Double indirimOrani;

    public IndirimDecorator(Urun temelUrun, Double indirimOrani) {
        super(temelUrun);
        this.indirimOrani = indirimOrani;
    }

    @Override
    public String aciklama() {
        return temelUrun.aciklama() + " (Indirimli)";
    }

    @Override
    public Double fiyat() {
        return temelUrun.fiyat() * (1 - indirimOrani);
    }
}
