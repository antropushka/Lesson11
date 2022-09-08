package by.epam.lesson11.task9.main;


import by.epam.lesson11.print.Print;
import by.epam.lesson11.task9.beans.Book;
import by.epam.lesson11.task9.beans.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Main { // готово
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        Library library = new Library(books);
        Book book1 = new Book(0, "Algoritmy", new String[]{"Rod stivens"}, "Izdatelstvo E",
                2018, 544, 50, "Hard cover");
        Book book2 = new Book(1,"Nauci menya letat'", new String[]{"Bob Armel", "Nut Hazel"},
                "ENAS", 2022, 20, 15, "Hard cover");
        Book book3 = new Book(2, "Ty vse ravno budesh menya lubit'", new String[]{"Katrin Leblan"},
                "Kontent", 2019, 32, 12, "Hard cover");
        Book book4 = new Book(2, "Mothers kiss'", new String[]{"Katrin Leblan"},
                "ENAS", 2019, 33, 12, "Hard cover");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println("Please make a choice");
        System.out.println("1. a list of books by a given author" + "\n" +
                "2. a list of books published by a given publishing house" + "\n" +
                "3. a list of books released after a given year." + "\n" +
                "4. exit" + "\n");

        while (true) {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Please, make your choice again");
            }
            int userChoice = scanner.nextInt();
            if (userChoice == 4) {
                break;
            }
            if (userChoice < 1 || userChoice > 4) {
                System.out.println("Invalid choice. Please, make your choice again");
                continue;
            }
            switch (userChoice) {
                case 1:
                    Print.printSomeList(library.getBooksByAuthor(scanner));
                    break;
                case 2:
                    Print.printSomeList(library.getBooksByPublishingHouse(scanner));
                    break;
                case 3:
                    Print.printSomeList(library.getBooksByPublicationYear(scanner));
                    break;
            }
        }
    }
}
