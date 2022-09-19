package by.itacademy.hw8.classes.task9book;

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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void add(Book book) {
        books.add(book);
    }
    public void delete(Book book) {
        books.remove(book);
    }

    public List<Book> byAuthor (String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (int i = 0; i < booksByAuthor.size(); i++) {
           // List<String> authors = books.get(i).getAuthor();
            if (author.equals(books.get(i).getAuthor()))
            {
                booksByAuthor.add(books.get(i));

            }
        }
        return  booksByAuthor;
    }

    public List<Book> byPublisher (String publisher) {
        List<Book> booksByPublisher = new ArrayList<Book>();
        for (int i = 0; i < booksByPublisher.size(); i++) {
            if (publisher.equals(books.get(i).getPublisher()))
            {
                booksByPublisher.add(books.get(i));
            }
        }

        return booksByPublisher;
    }

    public List<Book> byYear (int year) {
        List<Book> booksByYear = new ArrayList<Book>();

        for (int i = 0; i < booksByYear.size(); i++) {
            if (year<books.get(i).getYear()) {
                booksByYear.add(books.get(i));
            }
        }
        return booksByYear;
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
