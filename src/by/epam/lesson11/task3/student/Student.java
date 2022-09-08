package by.epam.lesson11.task3.student;
//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из
//        пяти элементов).
//        Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//        номеров групп студентов, имеющих оценки, равные только 9 или 10.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Student {
    private String surname;
    private String initials;
    private int groupNumber;
    private int[] academicPerformanceList;
    private int numOfGrades;

    public Student(String surname, String initials, int groupNumber) {
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getAcademicPerformanceList() {
        return academicPerformanceList;
    }

    public void setAcademicPerformanceList(int[] academicPerformanceList) {
        this.academicPerformanceList = academicPerformanceList;
    }

    public int getNumOfGrades() {
        return numOfGrades;
    }

    public void setNumOfGrades(int numOfGrades) {
        this.numOfGrades = numOfGrades;
    }

    public void addGrade(int grade) {
        if (numOfGrades >= 5) {
            System.out.println("Sorry, there are already 5 grades in the academic performance list");
            ;
        }
        academicPerformanceList[numOfGrades] = grade;
        numOfGrades++;
    }

    public boolean isGoodStudent() {
        for (int grade : academicPerformanceList) {
            if (grade < 9) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", initials='" + initials + '\'' +
                ", groupNumber=" + groupNumber +
                ", academicPerformanceList=" + Arrays.toString(academicPerformanceList) +
                ", numOfGrades=" + numOfGrades +
                '}';
    }
}
