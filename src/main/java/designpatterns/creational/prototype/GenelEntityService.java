package designpatterns.creational.prototype;

public class GenelEntityService {

    public BelgeTuru findBelgeTuruById(Long id) {
        try {
            //Burada veritabanına gelip giden uzun süren maliyetli bir sorgu olduğunu düşünelim.
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        BelgeTuru belgeTuru = new BelgeTuru();
        belgeTuru.setId(id);

        String adi;
        if (id.compareTo(1L) == 0) {
            adi = "Kişisel";
        } else if (id.compareTo(2L) == 0) {
            adi = "Kurumsal";
        } else {
            adi = "Genel";
        }

        belgeTuru.setAdi(adi);
        return belgeTuru;
    }


    public Kategori findKategoriById(Long id) {
        try {
            //Burada veritabanına gelip giden uzun süren maliyetli bir sorgu olduğunu düşünelim.
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Kategori kategori = new Kategori();
        kategori.setId(id);

        String adi;
        if (id.compareTo(1L) == 0) {
            adi = "Özel";
        } else if (id.compareTo(2L) == 0) {
            adi = "İş";
        } else {
            adi = "Genel";
        }

        kategori.setAdi(adi);
        return kategori;
    }

    public Belge findBelgeById(Long id) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Belge belge = new Belge();
        belge.setId(id);
        belge.setBelgeTuru(findBelgeTuruById(id));
        belge.setKategori(findKategoriById(id));


        String adi;
        String veri;

        if (id.compareTo(1L) == 0) {
            adi = "Mektup";
            veri = "Bu bir mektup içeriği";
        } else if (id.compareTo(2L) == 0) {
            adi = "Rapor";
            veri = "Bu bir rapor içeriği";
        } else {
            adi = "Genel kurallar";
            veri = "Bu bir genel kural içeriği";
        }

        belge.setAdi(adi);
        belge.setVeri(veri);

        return belge;
    }


}
