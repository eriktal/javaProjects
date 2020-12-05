package emailApplication;

public class Email {

    public static void main(String[] args) {
        try {
            EmailApp app = new EmailApp("John", "Doe");
            //app.setMailboxCapacity(1000);
            //app.steAlternateEmail("eric.t23@love.com");
            //app.setNewPassword("qfuhfoqifhowq3245324j");
            System.out.println(app.getInfo());
        } catch (Exception ex) {
            System.out.println("Choose 1 for Sales , 2 for Developer , 3 for Accountant and 4 for Human Resources.");
        }
    }
}
