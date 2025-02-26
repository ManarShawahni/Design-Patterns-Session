// X Problem: No Factory pattern, created manually
public class BuggyEmailReminder {
    private String message;

    public BuggyEmailReminder(String message) {
        this.message = message;
    }

    public void send() {
        System.out.println("Sending Email Reminder: " + message);
    }
}
