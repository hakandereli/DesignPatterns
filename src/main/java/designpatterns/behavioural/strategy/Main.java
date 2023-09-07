package designpatterns.behavioural.strategy;

public class Main {

    /**
     * Strategy Design Pattern, bir işlemin farklı şekillerde gerçekleştirilebileceği durumlarda kullanılan bir tasarım desenidir.
     * Bu desen, işlemin nasıl gerçekleştirileceğini belirleyen bir algoritma ailesini temsil eden bir arayüz kullanır.
     * Kullanıcı, uygulama sırasında hangi algoritmanın kullanılacağını seçebilir.
     *
     * Strategy Design Pattern, aşağıdaki sorunları çözer:
     *
     * Kod tekrarı: Bir işlemin farklı şekillerde gerçekleştirilebileceği durumlarda,
     * her bir durumda işlemin farklı bir şekilde uygulanmasını gerektiren koşullu ifadeler veya switch/case blokları kullanmak,
     * kod tekrarına neden olabilir.
     *
     * Kod esnekliği: Bir işlemin farklı şekillerde gerçekleştirilebileceği durumlarda, uygulamanın gereksinimleri
     * değiştikçe kodu değiştirmek zor olabilir.
     *
     * Test edilebilirlik: Bir işlemin farklı şekillerde gerçekleştirilebileceği durumlarda, her bir durumda işlemin
     * doğru çalışıp çalışmadığını test etmek zor olabilir.
     *
     * Java'da Strategy Design Pattern'i kullanmak için aşağıdaki adımları izleyebiliriz:
     *
     * Bir algoritma ailesini temsil eden bir arayüz tanımlayın.
     * Arayüzü uygulayan bir dizi sınıf oluşturun.
     * Kullanıcı, uygulama sırasında hangi algoritmanın kullanılacağını seçebilir.
     *
     * Aşağıdaki örnek, Java'da Strategy Design Pattern'in nasıl kullanıldığını göstermektedir:
     *
     *
     * */

    public static void main(String[] args) {
        Context context = new Context(new AlgorithmA());
        context.execute();

        context = new Context(new AlgorithmB());
        context.execute();
    }
}
