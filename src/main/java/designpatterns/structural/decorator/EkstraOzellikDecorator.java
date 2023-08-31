package designpatterns.structural.decorator;

/**
 * @author hdereli
 * @since 8/31/2023
 */
public class EkstraOzellikDecorator extends UrunDecorator{

    private String ekstraOzellik;

    public EkstraOzellikDecorator(Urun temelUrun, String ekstraOzellik) {
        super(temelUrun);
        this.ekstraOzellik = ekstraOzellik;
    }

    @Override
    public String aciklama() {
        return temelUrun.aciklama() + " (" + ekstraOzellik + ")";
    }

    @Override
    public Double fiyat() {
        return temelUrun.fiyat();
    }
}
