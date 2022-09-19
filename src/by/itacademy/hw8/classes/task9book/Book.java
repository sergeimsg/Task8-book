package by.itacademy.hw8.classes.task9book;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Book implements Serializable {
    public static final long serialVersionUID = 1;
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pageNumber;
    private int price;
    private String binding;

    public Book() {
       }

    public Book(int id, String name, String author, String publisher, int year, int pageNumber, int price, String binding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageNumber = pageNumber;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getId() == book.getId() && getYear() == book.getYear() && getPageNumber() == book.getPageNumber() && getPrice() == book.getPrice() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getPublisher(), book.getPublisher()) && Objects.equals(getBinding(), book.getBinding());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAuthor(), getPublisher(), getYear(), getPageNumber(), getPrice(), getBinding());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pageNumber=" + pageNumber +
                ", price=" + price +
                ", binding='" + binding + '\'' +
                '}';
    }
}
