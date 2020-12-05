package studentDatabase;

import java.util.Scanner;

public class DBApp {
    public static void main(String[] args) {
        System.out.println("Enter number of student to enroll today:");
        Scanner num = new Scanner(System.in);

        int numStudent = num.nextInt();
        StudentDB[] students = new StudentDB[numStudent];
        for (int i = 0; i < numStudent; i++) {
            students[i] = new StudentDB();
            students[i].registration();
            students[i].payBalance();
            System.out.println(students[i].toString());
        }
    }
}
