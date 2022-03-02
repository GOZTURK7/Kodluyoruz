package kitapSiralayici;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book(
                "Şu Çılgın Türkler",
                230,
                "Turgut Özakman",
                LocalDateTime.of(2020, 3, 3, 14, 50));
        Book b2 = new Book(
                "Yılanların Öcü",
                230,
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

        Set<Book> books = new HashSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        System.out.println(books);

        b1.compareTo(b2);


    }
}
