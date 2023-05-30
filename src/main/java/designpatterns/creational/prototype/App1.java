package designpatterns.creational.prototype;

import java.util.Date;

public class App1 {

    public static void main(String[] args) {

        //BU ÖRNEK SADIK BAHADIR MEMİŞİN YOUTUBE daki prototype design pattern videosundan faydalanarak yazılmıştır.

        //Bu tasarım kalıbının temeli clone metoduna dayanır.
        //Var olan bir obje new lenmeden clone lanarak kullanılır.
        //Bu ne işe yarar uzun sürecek bir işlem de veya tek tek yeniden oluşturulacak bir objede benzer durumlar varsa
        //Ben bu objeyi yeniden yaratma maliyetini göze almam bunu kopyalar yeni obje yi bu şekilde
        // çok daha hızlı oluştururum.

        //Aşağıdaki örnekte veritabanından çekilen maliyetli bir sorgu ile oluşturulan obje düşünelim.
        //2 inci bir belge oluşturmak istendiğinde tekrar 4 saniye beklemesi gerekecek sistemin biz bunu istemiyoruz.

        // Bu objeyi kopyalayıp üzerinde değişiklik yapmak çok daha az maliyetli olacaktır.


        GenelEntityService genelEntityService = new GenelEntityService();

        Date ilkTarih = new Date();
        Belge belge1 = genelEntityService.findBelgeById(1L);
        Date sonTarih = new Date();

        Long saniyeFarki = getSaniyeFarki(ilkTarih, sonTarih);

        System.out.println(belge1);
        System.out.println("saniye farkı :" + saniyeFarki);

        //    protected native Object clone() throws CloneNotSupportedException;
        //Obje sınıfında böyle bir method var ancak bu protected olduğu için klonlamak istediğin obje yi
        // clonable implements etmen gerekir.
        try {
            Date ilkTarih2 = new Date();
            Belge cloneBelge = belge1.clone();
            cloneBelge.setAdi("Günlük");
            cloneBelge.setVeri("Bu bir günlük verisidir.");
            //Aşağıdaki satırda alt nesneye ait bir özellik değiştirildiğinde kopyalanan objedeki de veri de değişir.
            //Buna shallow copy yani yüzeysel kopyalama denir kopyalanan objenin değişmemesini istiyorsak
            // deep copy yapmamız gerekir.
            //Deep copy yapmak için alt obje kalmayana kadar clonable yapıp tüm alt objeler de kopyalanmalıdır.
            cloneBelge.getKategori().setAdi("yeni kategori");
            Date sonTarih2 = new Date();
            Long cloneSaniyeFarki = getSaniyeFarki(ilkTarih2, sonTarih2);

            System.out.println(cloneBelge);
            System.out.println("saniye farkı :" + cloneSaniyeFarki);
            System.out.println(belge1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }

    private static Long getSaniyeFarki(Date ilkTarih, Date sonTarih) {
        //mili saniye cinsinden verdiği için 1000 e bölüp saniyeye çevirdim küçük farkları da yuvarlar bu şekilde
        long has = 1000;

        long saniyeFarkı = (sonTarih.getTime() / has) - (ilkTarih.getTime() / has);

        return saniyeFarkı;
    }
}
