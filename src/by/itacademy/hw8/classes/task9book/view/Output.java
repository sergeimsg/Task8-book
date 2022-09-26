package by.itacademy.hw8.classes.task9book.view;

import by.itacademy.hw8.classes.task9book.bean.Book;
import by.itacademy.hw8.classes.task9book.bean.BookStore;

import java.util.List;

public class Output {

    public void printBook(String choice, List<Book> books) {

        for (Book book : books) {
            System.out.printf("%10s |%-2d|%-20s|%-15s|%-10s|%-5d|%-5d|%-5d|%-8s|\n",choice, book.getId(), book.getName(),
                    book.getAuthor(), book.getPublisher(), book.getYear(), book.getPageNumber(),
                    book.getPrice(), book.getBinding());
        }

    }


     public void printAsBook (BookStore book) {
        List<Book> books = book.getBooks();
        for (Book copy : books) {

            System.out.printf("{%2d} {%20s} {%15s} {%10s} {%4d} {%5d} {%5d} {%10s} \n", copy.getId(), copy.getName(),copy.getAuthor(),
                    copy.getPublisher(), copy.getYear(), copy.getPageNumber(), copy.getPrice(), copy.getBinding());
        }




    }
}
