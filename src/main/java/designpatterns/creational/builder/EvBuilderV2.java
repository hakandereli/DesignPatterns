package designpatterns.creational.builder;

public class EvBuilderV2 {

    private String il;
    private String ilce;
    private String mahalle;

    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    private int balkonSayisi;
    private int binaYili;

    private boolean isDublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasCocukParki;
    private boolean hasKlima;


    //Aşağıdaki örnekte 3 string ve 2 int değer ile 2 farklı constructor oluşturabildik ve bunların isimleri farklı dikkat et!
    /*
    * Parametre geçilen il, ilçe, mahalle, binayili, odasayisi zorunlu olması istendiği için bu şekilde yazıldı.
    * ve zorunlu olması istendiği dışarıdan da tekrar değiştirelememesi için bunların setterları kaldırıldı.
    *
    * startDublexEvBuilder metodunda isDublex setlemesi yapıldığı için onunda setteri kaldırıldı.
    * */
    public static EvBuilderV2 startNormalEvBuilder(String il, String ilce, String mahalle, int binaYili, int odaSayisi){

        EvBuilderV2 evBuilderV2 = new EvBuilderV2();
        evBuilderV2.il = il;
        evBuilderV2.ilce = ilce;
        evBuilderV2.mahalle = mahalle;
        evBuilderV2.binaYili = binaYili;
        evBuilderV2.odaSayisi = odaSayisi;

        return evBuilderV2;
    }

    public static EvBuilderV2 startDublexEvBuilder(String il, String ilce, String mahalle, int binaYili, int odaSayisi){

        EvBuilderV2 evBuilderV2 = new EvBuilderV2();
        evBuilderV2.il = il;
        evBuilderV2.ilce = ilce;
        evBuilderV2.mahalle = mahalle;
        evBuilderV2.binaYili = binaYili;
        evBuilderV2.odaSayisi = odaSayisi;
        evBuilderV2.isDublex = true;

        return evBuilderV2;
    }

    public Ev build(){
        Ev ev = new Ev();

        ev.setIl(il);
        ev.setIlce(ilce);
        ev.setMahalle(mahalle);

        ev.setOdaSayisi(odaSayisi);
        ev.setBanyoSayisi(banyoSayisi);
        ev.setTuvaletSayisi(tuvaletSayisi);
        ev.setBalkonSayisi(balkonSayisi);
        ev.setBinaYili(binaYili);

        ev.setDublex(isDublex);
        ev.setEsyali(isEsyali);
        ev.setHasOtopark(hasOtopark);
        ev.setHasCocukParki(hasCocukParki);
        ev.setHasKlima(hasKlima);

        return ev;
    }


    public EvBuilderV2 setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilderV2 setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilderV2 setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

    public EvBuilderV2 setEsyali(boolean esyali) {
        isEsyali = esyali;
        return this;
    }

    public EvBuilderV2 setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return this;
    }

    public EvBuilderV2 setHasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
        return this;
    }

    public EvBuilderV2 setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
        return this;
    }
}
