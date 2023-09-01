package designpatterns.structural.flyweight.example2;

/**
 * @author hdereli
 * @since 9/1/2023
 */
public class LibraryCatalog {
    public static void main(String[] args) {
        /**
         * Senaryo: Bir Kütüphane Katalogu
         *
         * Diyelim ki bir kütüphane katalogu yazılımı geliştiriyorsunuz ve her kitap için ayrı bir
         * nesne oluşturmak yerine Flyweight tasarım desenini kullanarak bellek kullanımını optimize
         * etmek istiyorsunuz. Kitapların birçok ortak özelliği (örneğin yazar, yayınevi) var,
         * ancak her kitap için farklı olan özellikler (örneğin kitap adı, ISBN numarası) vardır.
         *
         *
         *
         * */

        BookFactory bookFactory = new BookFactory();

        Book book1 = bookFactory.getBook("Java Programming", "John Smith", "ABC Publications");
        Book book2 = bookFactory.getBook("Python Basics", "Jane Doe", "XYZ Press");
        Book book3 = bookFactory.getBook("Java Programming", "John Smith", "ABC Publications"); // Aynı kitap

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

    }
}
