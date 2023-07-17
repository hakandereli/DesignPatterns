package designpatterns.behavioural.iterator;

import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        /**
         * Kümelenmiş bir nesnenin öğelerini , kendi içerisinde ki tasarım şekillerini göstermeden sırayla erişmek için
         * bir yol tanımlayın diyor. Bu tasarım kalıbı buradan çıkmıştır.
         *
         * Bu kümeler ne olabilir Liste olabilir , Array olabilir. Bu tiplerden bağımsız bir iterator dönmeni ister bu
         * tasarım kalıbı.
         *
         * Tutulan veriler string olabilir, integer, double olabilir.
         *
         *
         *
         * Bu örnek için soru LİSTESİ tutan bir kitap olsun.
         * bir de Soru ARRAY i tutan bir de fasükül olsun.
         * */

        Kitap kitap = new Kitap("Matematik");

//        List<Soru> soruList = kitap.getSoruList();

//        yazdir(soruList);

        Fasikul fasikul = new Fasikul("Türkçe");

//        Soru[] sorular = fasikul.getSorular();

//        yazdir(sorular);
        /**
         * Burada sorular arrayi ile aşağıdaki yazdır metodunu kullanamayacağın için.
         * Tip fakrlı çünkü. Iterator tasarım kalıbı çıkarılmış her yazdır metodu için ayrı ayrı tip verip ayrı ayrı metodlar
         * yazmak doğru olmaz kendimizi tekrarlamış oluruz bunu ortak bir yapıya çekerek.
         * kod tekrarını kalabalığını önlemiş oluruz.
         *
         * Bunu nasıl yapıcaksın liste için getSoruList methodunda iterator dönersen olur.
         * ancak array için böyle bir şey yok onun içinde bir ArrayIterator yazman gerekir.
         * Dönüş tipi Iterator tipinde olmalı.
         * */

        /**
         * Iterator li operasyon
         * */

        Iterator soruIteratorKitap = kitap.getSoruIterator();

        yazdir(soruIteratorKitap);

        Iterator soruIteratorFasikul = fasikul.getSoruIterator();

        yazdir(soruIteratorFasikul);

    }

    private static void yazdir(Iterator soruIteratorKitapAndFasikul) {
        while (soruIteratorKitapAndFasikul.hasNext()) {
            Soru soru = (Soru) soruIteratorKitapAndFasikul.next();

            Long soruNo = soru.getSoruNo();

            System.out.println("Soru no:" + soruNo);
        }
    }

    /**
     * Bu yöntem tip bağımsız kümelerle işlem yapmanı sağlar.
     * ve iterator sayesinde bunların ortak işlemlerini kendini tekrarlamadan yazmanı sağlar.
     * */

//    private static void yazdir(List<Soru> soruList) {
//        for (Soru soru : soruList){
//            Long soruNo = soru.getSoruNo();
//
//            System.out.println("Soru No:   " + soruNo);
//        }
//    }
}
