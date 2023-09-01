package designpatterns.structural.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hdereli
 * @since 9/1/2023
 */
public class BookFactory {

    private Map<String, Book> books = new HashMap<>();

    public Book getBook(String title, String author, String publisher) {

        String key = title + "-" + author + "-" + publisher;

        if (books.containsKey(key)) {
            return books.get(key);
        } else {
            Book newBook = new ConcreteBook(title, author, publisher);
            books.put(key, newBook);
            return newBook;
        }
    }
}






