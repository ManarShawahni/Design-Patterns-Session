// Factory Pattern: Creates different reminders dynamically
public class ReminderFactory {
    public static Reminder createReminder(String type, String message) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailReminder(message);
        } else if (type.equalsIgnoreCase("sms")) {
            return new SMSReminder(message);
        } else {
            throw new IllegalArgumentException("Unknown reminder type: " + type);
        }
    }
}
