package kitapSiralayici;

import comparableInterface_Calısması_Kaynak_Youtube.People;

import java.time.LocalDateTime;

public class Book implements Comparable<Book>{

    private String name;

    private int pageNumber;

    private String authorName;

    private LocalDateTime releasingDate;

    public Book() {
    }

    public Book(String name, int pageNumber, String authorName, LocalDateTime releasingDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.releasingDate = releasingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDateTime getReleasingDate() {
        return releasingDate;
    }

    public void setReleasingDate(LocalDateTime releasingDate) {
        this.releasingDate = releasingDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageNumber=" + pageNumber +
                ", authorName='" + authorName + '\'' +
                ", releasingDate=" + releasingDate +
                '}';
    }


    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }



}
