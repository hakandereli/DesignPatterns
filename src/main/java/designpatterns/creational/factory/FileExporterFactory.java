package designpatterns.creational.factory;

public class FileExporterFactory {

    //Burada biz bir FileExporter fabrikası yarattık.
    //static bir getınstance isminde methodu ile new leme işlemlerini
    // yani fabrika dan çıkacak ürünleri(objeleri) n kontrolünü tek bir class ta toplamış olduk.
    //Peki neden yaptık bunu eğer bunu bu şekilde kullanmassak çok büyük bir projede adam her excel çıktısı almak
    //istediğinde excelexporter ı new lerse ilerde excelexporter da bir değişiklik yaparsan kullandığın her yerde
    //değişiklik yapman gerekecek biz bunun fabrikasını yaparak buradan ürettiğimiz buradan değişiklik yapman yeterli

    //Ancak burada da switch case veya if else çok fazla tip varsa bağımlılık oluşmaya başlayacak ona abstract factory pattern de bakıcaz.

    //Diyelim ki devlet dedi ki bundan sonra aktardığınız her dosyaya imza ekleyeceksiniz yüzlerce kodu değiştirmene gerek yok
    //Sadece FileExporter classına bir gövdesiz method ve excel de pdf de nasıl olacağına dair methodları implements etmek

    //Mesala HibernateUtil classında aşağıda örneği bunu kullanarak session üreten bir fabrika yaparız sürekli new lemeyiz.

//    public class HibernateUtil {
//
//        private static final SessionFactory sessionFactory = buildSessionFactory();
//
//        private static SessionFactory buildSessionFactory() {
//
//            try {
//
//                Configuration cfg = new Configuration();
//                SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
//                return sessionFactory;
//
//            } catch (Exception e) {
//                System.out.println("Session factory oluşturulurken hata oluştu" + e);
//                throw new ExceptionInInitializerError(e);
//            }
//        }
//
//        public static SessionFactory getSessionFactory() {
//            return sessionFactory;
//        }
//    }
    public static FileExporter getInstance(FileType fileType){

        switch (fileType){
            case PDF : return new PdfExporter();
            case EXCEL: return new ExcelExporter();
            default: throw new UnsupportedOperationException();
        }
    }
}
