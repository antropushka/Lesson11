package by.epam.lesson11.task8.beans;
//Создать класс Customer, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
//        методами. Задать критерии выбора данных и вывести эти данные на консоль.
//        Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//        Найти и вывести:
//        a) список покупателей в алфавитном порядке;
//        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import java.util.Objects;
import java.util.Scanner;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private long creditCardNum;
    private long bankCountNum;
    static int ID;

    public Customer(int id,
                    String surname,
                    String name,
                    String middleName,
                    String address,
                    long creditCardNum,
                    long bankCountNum) {
        this.id = ID++;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNum = creditCardNum;
        this.bankCountNum = bankCountNum;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public long getCreditCardNum() {
        return creditCardNum;
    }

    public long getBankCountNum() {
        return bankCountNum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getId() == customer.getId()
                && getCreditCardNum() == customer.getCreditCardNum()
                && getBankCountNum() == customer.getBankCountNum()
                && Objects.equals(getSurname(), customer.getSurname())
                && Objects.equals(getName(), customer.getName())
                && Objects.equals(getMiddleName(), customer.getMiddleName())
                && Objects.equals(getAddress(), customer.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getSurname(),
                getName(),
                getMiddleName(),
                getAddress(),
                getCreditCardNum(),
                getBankCountNum());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNum=" + creditCardNum +
                ", bankCountNum=" + bankCountNum +
                '}';
    }
}
