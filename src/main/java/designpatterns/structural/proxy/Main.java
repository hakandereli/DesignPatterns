package designpatterns.structural.proxy;

public class Main {

    /**
     * Proxy tasarım deseni, bir nesnenin yerine geçen ve bu nesneye erişimi kontrol eden bir araştırıcı veya vekil nesne oluşturmayı amaçlar
     * . Bu desen, nesne yaratma ve erişim kontrolü, gecikmeli yükleme (lazy loading),
     * önbellekleme, nesne klonlaması, izin verme veya engelleme gibi senaryoları ele almak için kullanılabilir.
     * Ayrıca, gerçek nesnenin yaratılması veya yüklenmesi gereken durumları kontrol edebilir.
     *
     * Proxy tasarım deseni, genellikle aşağıdaki problemleri çözmek için kullanılır:
     *
     * Gecikmeli Yükleme (Lazy Loading): Bir nesnenin yaratılması veya yüklenmesi gerektiğinde gecikmeli olarak oluşturulmasını veya yüklenmesini sağlar.
     * Bu, kaynakları etkili bir şekilde kullanmanıza yardımcı olabilir.
     *
     * Erişim Kontrolü: Bir nesneye erişimi kontrol etmek ve sınırlamak için kullanılabilir.
     * Örneğin, kullanıcıların belirli bir nesneye erişimini sınırlamak için kullanılabilir.
     *
     * Önbellekleme: Sık kullanılan verileri önbellekleme amacıyla kullanılabilir. Verileri önbellekleyen bir proxy,
     * gerçek nesneye erişmeden önce önbelleğe bakabilir ve gerektiğinde gerçek nesneyi yükler.
     *
     *
     *Java'da bir proxy tasarım deseni örneği aşağıda verilmiştir. Bu örnekte,
     * bir Resim arayüzü ile çalışan ve resim dosyasının yüklenmesini simüle eden bir Proxy sınıfı kullanılmaktadır.
     * */

    public static void main(String[] args) {
        Resim resim1 = new ProxyResim("resim1.jpg");
        Resim resim2 = new ProxyResim("resim2.jpg");

        //// Resim dosyaları yüklenmez, yükleme sadece gerekli olduğunda gerçekleşir
        resim1.goster();
        resim2.goster();
    }
}
