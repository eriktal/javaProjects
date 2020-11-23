package emailApplication;

import java.util.Scanner;

public class EmailApp {
    private String firstName;
    private String lastName;
    private String department;
    private final String companySuffix = "organization.com";
    private String password;
    private String alternateEmail;
    private String email;
    private int emailMaxCapacity = 500;

    //Constructor to receive employee infos.
    public EmailApp(String firstName, String lastName) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = getDepartment();
        int passwordLength = 10;
        this.password = setPassword(passwordLength);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;


    }

    //Ask for the department.
    private String getDepartment() throws Exception {

        Scanner dept = new Scanner(System.in);
        System.out.println("Department Codes:\n 1=Sales\n 2=Developer\n 3=Accountant\n 4=HR\n Enter Department Code:");
        int number = dept.nextInt();
        if (number == 1)
            return "Sales";
        else if (number == 2)
            return "Dev";
        else if (number == 3)
            return "Acct";
        else if (number == 4)
            return "HR";
        throw new Exception(" Out of range");

    }

    //Generate random password
    private String setPassword(int passwordLength) {
        String passwordChoice = "ABCDEFGHIGKLMNOPQRSUVWYZabcdefghigklmnopqrsuvwyz0123456789@#$%!";
        char[] password = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            int rand = (int) (Math.random() * passwordChoice.length());
            password[i] = passwordChoice.charAt(rand);
        }
        return new String(password);
    }

    //Set new password
    public void setNewPassword(String newPassword) {
        this.password = newPassword;
    }

    // set alternate email
    public void steAlternateEmail(String altEmail) {
        this.email = altEmail;
    }

    //set mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.emailMaxCapacity = mailboxCapacity;
    }

    public String getNewPassword() {
        return password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public int getEmailMaxCapacity() {
        return emailMaxCapacity;
    }

    //Final info
    public String getInfo() {
        return "Display New Employee:\n" + firstName.toUpperCase() + " " + lastName.toUpperCase() +
                "\nEmail:" + email + "\nEmail Capacity: " + emailMaxCapacity + "mb" + "\n" + "Your password is:" + password;
    }

}



