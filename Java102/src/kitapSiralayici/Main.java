package kitapSiralayici;

import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book(
                "Su Çılgın Türkler",
                210,
                "Turgut Özakman",
                LocalDateTime.of(2020, 3, 3, 14, 50));
        Book b2 = new Book(
                "Yılanların Öcü",
                20,
                "Fakir Baykurt",
                LocalDateTime.of(2020, 3, 3, 14, 50));
        Book b3 = new Book(
                "Körlük",
                23,
                "Jose Saramago",
                LocalDateTime.of(2020, 3, 3, 14, 50));
        Book b4 = new Book(
                "Devlet",
                230,
                "Platon",
                LocalDateTime.of(2020, 3, 3, 14, 50));

        Set<Book> books = new TreeSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        System.out.println(books);

        System.out.println("*************************");

        TreeSet<Book> books1 = new TreeSet<>(new CompareByPageNumber());

        books1.add(b1);
        books1.add(b2);
        books1.add(b3);
        books1.add(b4);

        System.out.println(books1);

    }
}
