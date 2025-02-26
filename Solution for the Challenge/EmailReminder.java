// Factory Pattern: Created through ReminderFactory
public class EmailReminder implements Reminder {
    private String message;

    public EmailReminder(String message) {
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Sending Email Reminder: " + message);
    }
}
