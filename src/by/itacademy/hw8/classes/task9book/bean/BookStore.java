package by.itacademy.hw8.classes.task9book.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookStore implements Serializable {
    public static final long serialVersionUID = 1;

    private List<Book> books;

    public BookStore() {

        books = new ArrayList<Book>();
    }

    public BookStore(List<Book> books) {
        this.books = books;


    }


    public void add(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void delete(Book book) {
        books.remove(book);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookStore)) return false;
        BookStore bookStore = (BookStore) o;
        return Objects.equals(getBooks(), bookStore.getBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBooks());
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "books=" + books +
                '}';
    }
}
