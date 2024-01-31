package designpatterns.creational.builder;

public class EmlakciV2 {

    public static void main(String[] args) {

        //Avantajları girmemiz gerekmeyen alanları hiç girmeden o alanlara örneğin int ise 0 boolean ise false varsayılan değerleri atanmış oldu.
        //Klasik yöntem ile sırasına uyarak hepsini girmen lazım
        Ev ev = EvBuilder.startBuilder()
                .setIl("İstanbul")
                .setIlce("Ataşehir")
                .setMahalle("Kayışdağı")
                .build();

        printEv(ev);


        //////////////////////////////////////////////////

        Ev dublexEv = EvBuilderV2.startDublexEvBuilder("Ankara", "Keçiören", "Uzunlar", 2022, 3).build();
        printEv(dublexEv);

        ///////////////////////////////////////////////////////

        Ev normalEv = EvBuilderV2.startNormalEvBuilder("İstanbul", "Kadıköy", "Bahariye", 2009, 2).build();
        printEv(normalEv);
    }

    private static void printEv(Ev ev) {

        System.out.println();

        System.out.println("Ev Eklendi -> " + ev);

        System.out.println();

    }
}
