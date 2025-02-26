// Factory Pattern: Created through ReminderFactory
public class SMSReminder implements Reminder {
    private String message;

    public SMSReminder(String message) {
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS Reminder: " + message);
    }
}
