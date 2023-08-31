package designpatterns.structural.decorator;

/**
 * @author hdereli
 * @since 8/31/2023
 */
abstract class UrunDecorator implements Urun {

    protected Urun temelUrun;

    public UrunDecorator(Urun temelUrun) {
        this.temelUrun = temelUrun;
    }

    @Override
    public abstract String aciklama();

    @Override
    public abstract Double fiyat();

}
