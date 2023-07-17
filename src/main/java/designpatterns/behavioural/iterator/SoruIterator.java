package designpatterns.behavioural.iterator;

import java.util.Iterator;

/**
 * @author hdereli
 * @since 7/13/2023
 */
public class SoruIterator implements Iterator {

    private Soru[] sorular;
    private int sira;

    public SoruIterator(Soru[] sorular) {
        this.sorular = sorular;
    }

    @Override
    public boolean hasNext() {
        //Sonraki var mı yok mu bu bilgiyi döner.

        if (sira < sorular.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        //Sonraki varsa sonraki elemanı dönersin burada
        Soru soru = sorular[sira];
        sira++;

        return soru;
    }
}
