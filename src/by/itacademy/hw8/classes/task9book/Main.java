package by.itacademy.hw8.classes.task9book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        List<Book> books = new ArrayList<>();

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


        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        bookStore.byAuthor("Tolstoi");
        bookStore.byPublisher("Vostok");
        bookStore.byYear(2018);

        List<Book> booksAuthor = bookStore.byAuthor("Tolstoi");
        List<Book> bookList = bookStore.byPublisher("Vostok");
        printBook(books);
        System.out.println("---------------------");
        printBook(booksAuthor);
        printBook(bookList);

    }
        public static void printBook(List < Book > print) {

            for (Book book : print) {
                System.out.printf("|%-2d|%-20s|%-15s|%-10s|%-5d|%-5d|%-5d|%-8s|\n", book.getId(), book.getName(),
                        book.getAuthor(), book.getPublisher(), book.getYear(), book.getPageNumber(),
                        book.getPrice(), book.getBinding());
            }

        }
    }

