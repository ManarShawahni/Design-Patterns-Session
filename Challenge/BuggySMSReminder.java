// X Problem: No Factory pattern, created manually
public class BuggySMSReminder {
    private String message;

    public BuggySMSReminder(String message) {
        this.message = message;
    }

    public void send() {
        System.out.println("Sending SMS Reminder: " + message);
    }
}
