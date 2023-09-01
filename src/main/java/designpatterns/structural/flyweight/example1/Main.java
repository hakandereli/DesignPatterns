package designpatterns.structural.flyweight.example1;

public class Main {

    /**
     * Flyweight Tasarım Deseni (Flyweight Design Pattern),
     * yazılım geliştirme süreçlerinde karşılaşılan bellek tüketimi gibi sorunları çözmek ve
     * kaynak kullanımını optimize etmek için kullanılan bir tasarım desenidir. Bu desen, çok sayıda benzer nesnenin
     * bellek tüketimini azaltmak için kullanılır. Flyweight tasarım deseni, nesne yaratma maliyetlerini düşürmek ve
     * genellikle bellek kullanımını optimize etmek amacıyla kullanılır.
     *
     * Flyweight tasarım deseninin ana avantajları şunlardır:
     *
     * Bellek Tasarrufu: Flyweight deseni, aynı verilere sahip çok sayıda nesne yaratmanın gereksiz bellek tüketimini önler.
     * Ortak verileri paylaşarak bellek kullanımını azaltır.
     *
     * Performans İyileştirmesi: Bellek tüketimindeki azalma, programın genel performansını artırabilir.
     * Çünkü daha az bellek kullanımı, daha az bellek erişimine ve daha hızlı işlem sürelerine yol açabilir.
     *
     * Nesne Sayısının Azalması: Bu desen, kodun nesne sayısını azaltabilir,
     * böylece daha düzenli ve daha kolay anlaşılır kod yazmanıza yardımcı olur.
     *
     * Flyweight tasarım deseni, özellikle aşağıdaki durumlarda kullanışlıdır:
     *
     * Uygulamanızda çok sayıda nesne bulunuyorsa ve bu nesnelerin birçoğu benzer özelliklere sahipse.
     * Bu nesnelerin bellek kullanımı uygulamanızı yavaşlatıyorsa.
     * Nesnelerin tekrar tekrar yaratılması ve bu nesnelerin aynı verilere sahip olması gerekiyorsa.
     *
     *
     * Örnek bir senaryo olarak, bir metin belgesi düzenleme uygulamasını ele alalım.
     * Bu uygulama, metin içindeki her karakter için bir nesne oluşturursa, bellek tüketimi yüksek olabilir.
     * Bunun yerine, her karakter için aynı metin bilgisini paylaşan bir Flyweight tasarımını kullanarak bellek kullanımını azaltabiliriz.
     * */

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        String text = "Merhaba, Flyweight Tasarım Deseni!";

        for (char c : text.toCharArray()){
            FlyweightCharacter character = characterFactory.getCharacter(c);
            character.printCharacter();
        }
    }
}
