package by.itacademy.hw8.classes.task9book.main;

import by.itacademy.hw8.classes.task9book.bean.Book;
import by.itacademy.hw8.classes.task9book.bean.BookStore;
import by.itacademy.hw8.classes.task9book.logic.BookLogic;
import by.itacademy.hw8.classes.task9book.view.Output;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book(91, "Pieace and War", "Tolstoi", "Vostok",
                1965, 562, 55, "Hard");
        Book book2 = new Book(81, "Mova", "Martinovich", "Logvinau",
                2018, 302, 75, "Soft");
        Book book3 = new Book(61, "Neznaika", "Nosov", "Asveta",
                2008, 462, 15, "Hard");
        Book book4 = new Book(72, "Governor", "Makiavelli", "Italy",
                1568, 450, 562, "Hard");
        Book book5 = new Book(63, "Martin Iden", "London", "NY",
                1983, 223, 123, "Hard");
        Book book6 = new Book(91, "Kazaki", "Tolstoi", "Vostok",
                1972, 162, 13, "Soft");

        // different types af adding objects
        BookStore newBook = new BookStore();
        newBook.add(new Book(91, "Pieace and War", "Tolstoi", "Vostok",
                1965, 562, 55, "Hard"));
        newBook.add(book2);
        newBook.add(book3);
        newBook.add(book4);
        newBook.add(book5);
        newBook.add(book6);

        // different types af adding objects
        BookStore bookStore1 = new BookStore() {
            {add(book1);
             add(book2);
             add(book3);
             add(book4);
             add(book5);
             add(book6);
        }
        };

        BookLogic bookLogic =  new BookLogic();
        Output output = new Output();
        List<Book> bookList = bookLogic.byPublisher("Asveta", bookStore1);
        output.printBook("Print by publisher",bookList);
        output.printAsBook(bookStore1);

        System.out.println("To check one more output type ");
        for (Book bookX : bookLogic.byYear(1965, bookStore1) ) {
            System.out.println("Author "+bookX.getAuthor() + "  year"+ bookX.getYear());

        }
        System.out.println("By author");
        output.printBook("Print by author",bookLogic.byAuthor("Tolstoi", newBook));



    }

        }


