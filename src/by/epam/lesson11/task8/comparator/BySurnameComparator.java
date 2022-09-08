package by.epam.lesson11.task8.comparator;

import by.epam.lesson11.task8.beans.Customer;

import java.util.Comparator;

public class BySurnameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
      if ( customer1.getSurname() != customer2.getSurname()) {
          return customer1.getSurname().compareTo(customer2.getSurname());
      }
        if ( customer1.getName() != customer2.getName()) {
            return customer1.getName().compareTo(customer2.getName());
        }
      return customer1.getMiddleName().compareTo(customer2.getMiddleName());
      }
}

