package designpatterns.behavioural.command;

import designpatterns.behavioural.command.falsceweg.enums.Operationstyp;
import designpatterns.behavioural.command.falsceweg.Edva;

import java.math.BigDecimal;

public class App1 {

    //Bu Örnek Sadık Bahadır Memişin Youtube daki örneğinden alınmıştır.
//https://www.youtube.com/watch?v=5_seDc1DDGI

    /**
     * Bir isteği nesne olarak encapsule etmek istediğimiz de kullanırız bu patterni
     * <p>
     * Yapılacak istek ile alakalı tüm bilgileri diğer isteklerden bağımsız nesneler haline getirmemizi sağlar.
     * <p>
     * Örneğin bir hesap makinesi uygulaması düşünürsek eklenecek her operasyon da yeni bir if mi yazmak daha mantıklı
     * yoksa hepsi için yeni bir class ekleyip bunları soyutlamak mı.
     * <p>
     * Yapılan işlemi interface de bir metod tanımlayıp bu 4 işlemdeki process lerin her biri için bir class açarsın.
     * Kullanacağın yerde de toplama çıkarma gibi değil de bu interface i geçip işle metodunu çağırırsan.
     * <p>
     * Gelen her yeni hesap makinesi işlemin gidip if else yazmassın işlem yaptığın classı değiştirmessin sadece yeni
     * bir command classı eklersin bu kadar kod bağımsızlığını sağlarsın.
     * <p>
     * Her bir işlemin karmaşıklığını kendi classının içerisine almış olursun if else yazmassın kod bakımı çok kolaylaşır.
     */

    public static void main(String[] args) {
        BigDecimal gesamt = Edva.operation(Operationstyp.ADDITION, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal differenz = Edva.operation(Operationstyp.SUBTRAKTION, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal base = Edva.operation(Operationstyp.BASIS, BigDecimal.TEN, BigDecimal.valueOf(2));
        BigDecimal mod = Edva.operation(Operationstyp.MODDING, BigDecimal.TEN, BigDecimal.valueOf(3));


        System.out.println("Gesamt : " + gesamt);
        System.out.println("Differenz : " + differenz);
        System.out.println("Base : " + base);
        System.out.println("Mod : " + mod);
    }

}
