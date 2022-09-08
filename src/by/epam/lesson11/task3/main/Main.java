package by.epam.lesson11.task3.main;

import by.epam.lesson11.task3.student.Student;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int num = 10;
        Student[] studentsList = new Student[num];
        studentsList[0] = new Student("Antropova", "T.V.", 1);
        studentsList[1] = new Student("Bogdanovich", "V.N.", 1);
        studentsList[2] = new Student("Samarikova", "V.V.", 1);
        studentsList[3] = new Student("Kondral", "A.S.", 2);
        studentsList[4] = new Student("Zybarev", "I.A", 2);
        studentsList[5] = new Student("Goncharov", "A.N.", 2);
        studentsList[6] = new Student("Kot", "I.V.", 2);
        studentsList[7] = new Student("Maslova", "I.M.", 3);
        studentsList[8] = new Student("Pomazoy", "A.P.", 3);
        studentsList[9] = new Student("Cvarkoy", "E.A", 3);

        int[] grades1 = {9, 10, 10, 10, 10};
        studentsList[0].setAcademicPerformanceList(grades1);
        int[] grades2 = {7, 4, 6, 5, 10};
        studentsList[1].setAcademicPerformanceList(grades2);

        for (int i = 0; i < 2; i++) {
           if (studentsList[i].isGoodStudent()) {
               System.out.println(studentsList[i]);
           }

        }







    }
}
