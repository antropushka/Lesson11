package by.epam.lesson11.task9.beans;
//Создать класс Book, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
//        Задать критерии выбора данных и вывести эти данные на консоль.
//        Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//        Найти и вывести:
//        a) список книг заданного автора;
//        b) список книг, выпущенных заданным издательством;
//        c) список книг, выпущенных после заданного года.

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Book implements Serializable {

    private int idBook;
    private String title;
    private String[] authors;
    private String publishingHouse;
    private int publicationYear;
    private int numbOfPages;
    private int price;
    private String bindingType;
    private static int ID;

    public Book(int idBook,
                String title,
                String[] authors,
                String publishingHouse,
                int publicationYear,
                int numbOfPages,
                int price,
                String bindingType) {
        this.idBook = ID++;
        this.title = title;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.publicationYear = publicationYear;
        this.numbOfPages = numbOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumbOfPages() {
        return numbOfPages;
    }

    public void setNumbOfPages(int numbOfPages) {
        this.numbOfPages = numbOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publicationYear=" + publicationYear +
                ", numbOfPages=" + numbOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getIdBook() == book.getIdBook() && getPublicationYear() == book.getPublicationYear()
                && getNumbOfPages() == book.getNumbOfPages() && getPrice() == book.getPrice()
                && Objects.equals(getTitle(), book.getTitle()) && Arrays.equals(getAuthors(), book.getAuthors())
                && Objects.equals(getPublishingHouse(), book.getPublishingHouse())
                && Objects.equals(getBindingType(), book.getBindingType());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getIdBook(), getTitle(), getPublishingHouse(), getPublicationYear(), getNumbOfPages(),
                getPrice(), getBindingType());
        result = 31 * result + Arrays.hashCode(getAuthors());
        return result;
    }
}
