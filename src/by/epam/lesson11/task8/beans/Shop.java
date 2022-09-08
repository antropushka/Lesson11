package by.epam.lesson11.task8.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop implements Serializable {

    private ArrayList<Customer> customers;

    public Shop(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomersByCardNum(Scanner scanner) {     //   b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
        List <Customer> customersByCardNum = new ArrayList<Customer>();
        System.out.println("Enter the enter the desired interval. \n " +
                "min = ");
        long min = scanner.nextLong();
        System.out.println("max = ");
        long max = scanner.nextLong();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCreditCardNum() > min && customers.get(i).getCreditCardNum() < max) {
                customersByCardNum.add(customers.get(i));
            }
        }
        return customersByCardNum;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "customers=" + customers +
                '}'
                ;
    }
}
