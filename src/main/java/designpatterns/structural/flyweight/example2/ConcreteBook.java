package designpatterns.structural.flyweight.example2;

/**
 * @author hdereli
 * @since 9/1/2023
 */
public class ConcreteBook implements Book {
    private String title;
    private String author;
    private String publisher;

    public ConcreteBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public void displayInfo() {
        System.out.println("Kitap Adı: " + title);
        System.out.println("Yazar: " + author);
        System.out.println("Yayınevi: " + publisher);
    }
}
