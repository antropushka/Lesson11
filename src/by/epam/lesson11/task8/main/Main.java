package by.epam.lesson11.task8.main;

import by.epam.lesson11.print.Print;
import by.epam.lesson11.task8.beans.Customer;
import by.epam.lesson11.task8.beans.Shop;
import by.epam.lesson11.task8.comparator.BySurnameComparator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Shop shop = new Shop(customers);
        Customer customer1 = new Customer(1, "ivanov", "ivan", "ivanovich", "minsk",
                9645_0505_2234_0000L, 383968403590L);
        Customer customer2 = new Customer(2, "sidorov", "vasilii", "ivanovich", "gomel",
                4646_0505_2234_0976L, 231832786590L);
        Customer customer3 = new Customer(3, "sidorov", "artem", "ivanovich", "vitebsk",
                3000_0505_2234_0976L, 231832786590L);
        Customer customer4 = new Customer(4, "antropov", "viktor", "mihailovich", "vetka",
                2353_9353_8350_3582L, 4000035035L);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        System.out.println("Please make a choice");
        System.out.println("1. sort by surname" + "\n" +
                "2. print information about customers by credit card" + "\n" +
                "3. exit" + "\n");

        while (true) {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Please, mame your choice again");
            }
            int userChoice = scanner.nextInt();
            if (userChoice == 3) {
                break;
            }
            if (userChoice < 1 || userChoice > 2) {
                System.out.println("Invalid choice. Please, make your choice again");
                continue;
            }

            switch (userChoice) {
                case 1:
                    customers.sort(new BySurnameComparator());
                    Print.printSomeList(customers);
                    break;
                case 2:
                    Print.printSomeList(shop.getCustomersByCardNum(scanner));
                    break;
            }
        }
    }
}
