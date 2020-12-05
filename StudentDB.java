package studentDatabase;

import java.util.Scanner;

public class StudentDB {
    private static int id = 1000;
    private final static int courseCost = 600;
    private String firstName;
    private String lastName;
    private int GradeYear;
    private String courses = "";
    private String studentID;
    private double tuitionBalance = 0;

    // student Constructor
    public StudentDB() {
        id++;
        Scanner name1 = new Scanner(System.in);
        System.out.println("Enter student First Name.");
        this.firstName = name1.nextLine();
        Scanner name2 = new Scanner(System.in);
        System.out.println("Enter student Last Name.");
        this.lastName = name2.nextLine();
        Scanner Year = new Scanner(System.in);
        System.out.println("\n 1 for Freshman\n 2 for Sophomore\n 3 for Junior\n 4 for Senior\n Enter student GradeYear.");
        this.GradeYear = Year.nextInt();
        if (GradeYear == 1) ;
        else if (GradeYear == 2) ;
        else if (GradeYear == 3) ;
        else if (GradeYear == 4) ;
        setStudentID();
    }

    private void setStudentID() {
        this.studentID = GradeYear + "" + id;
    }

    public void registration() {
        do {
            Scanner subject = new Scanner(System.in);
            System.out.print("Enter a course to register or Q to quit: ");
            String course = subject.nextLine();
            if ((!course.equals("Q")) && (!course.equals("q"))) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + courseCost;
            } else {
                break;
            }

        } while (1 != 0);

        System.out.println("Courses Enrolled:" + courses);

    }

    public void viewBalance() {
        System.out.println("Your balance is:$" + tuitionBalance);
    }

    public void payBalance() {
        viewBalance();
        if(tuitionBalance>0){
            System.out.println("Enter your payment:");
            Scanner pay = new Scanner(System.in);
            double payment = pay.nextInt();
            tuitionBalance = tuitionBalance - payment;
            System.out.println("Thank for your payment of:$" + payment);
        }

    }

        public String toString () {
            return "\nName:" + firstName + "," + lastName +
                    "\nStudentID:" + studentID +
                    "\nCourses Enrolled:" + courses +
                    "\nAccountBalance:$" + tuitionBalance;

    }
}













