package by.itacademy.hw8.classes.task9book.logic;

import by.itacademy.hw8.classes.task9book.bean.Book;
import by.itacademy.hw8.classes.task9book.bean.BookStore;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {


    public List<Book> byAuthor(String author, BookStore bookStore) {

        List<Book> booksByAuthor = new ArrayList<Book>();
        List<Book> books = bookStore.getBooks();
        for (int i = 0; i < books.size(); i++) {

            if (author.equals(books.get(i).getAuthor())) {
                booksByAuthor.add(books.get(i));

            }
        }

        return booksByAuthor;
    }


    public List<Book> byPublisher(String publisher, BookStore bookStore) {
        List<Book> booksByPublisher = new ArrayList<Book>();
        List<Book> books = bookStore.getBooks();
        for (int i = 0; i < books.size(); i++) {

            if (publisher.equals(books.get(i).getPublisher())) {
                booksByPublisher.add(books.get(i));
            }
        }

        return booksByPublisher;
    }

    public List<Book> byYear(int year, BookStore bookStore) {
        List<Book> booksByYear = new ArrayList<Book>();
        List<Book> books = bookStore.getBooks();
        for (Book book : books) {
            if (book.getYear() == year) {
                booksByYear.add(book);
                System.out.println(book.getYear());
            }
        }
        return booksByYear;
    }


}
