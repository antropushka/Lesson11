package by.epam.lesson11.task9.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library implements Serializable {


    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public List <Book> getBooksByAuthor (Scanner scanner) { //        a) список книг заданного автора;
        List <Book> booksByAuthor = new ArrayList<Book>();
        System.out.println("Enter the author");
        String userAuthor = scanner.nextLine();
        for (int i = 0; i < books.size(); i++) {
            if (userAuthor.equals(books.get(i).getAuthors())) {
                booksByAuthor.add(books.get(i));
            }
        }
        return booksByAuthor;
    }

    public List <Book> getBooksByPublishingHouse (Scanner scanner) { //        b) список книг, выпущенных заданным издательством;
        scanner = new Scanner(System.in);
        List <Book> booksByPublishingHouse  = new ArrayList<Book>();
        System.out.println("Enter the Publishing House");
        String userPublishingHouse = scanner.nextLine();
        for (int i = 0; i < books.size(); i++) {
            if (userPublishingHouse.equals(books.get(i).getPublishingHouse())) {
                booksByPublishingHouse.add(books.get(i));
            }
        }
        return booksByPublishingHouse;
    }

    public List <Book> getBooksByPublicationYear (Scanner scanner) { //        c) список книг, выпущенных после заданного года.
        List <Book> booksByPublicationYear  = new ArrayList<Book>();
        System.out.println("Enter the author");
        int userPublicationYear = scanner.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (userPublicationYear < (books.get(i).getPublicationYear())) {
                booksByPublicationYear.add(books.get(i));
            }
        }
        return booksByPublicationYear;
    }


}
