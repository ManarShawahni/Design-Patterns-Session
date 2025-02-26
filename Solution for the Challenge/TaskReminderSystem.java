// Uses Singleton (TaskManager)
// Uses Observer (Users get notified when tasks are added)
// Uses Factory (Creates reminders dynamically)
public class TaskReminderSystem {
    public static void main(String[] args) {
        TaskManager manager = TaskManager.getInstance(); // Singleton TaskManager

        User alice = new User("Alice");
        User bob = new User("Bob");

        manager.addUser(alice); // Observer pattern: Users subscribe
        manager.addUser(bob);

        // Factory Pattern: Creates reminders dynamically
        Reminder emailReminder = ReminderFactory.createReminder("email", "Complete your profile!");
        Reminder smsReminder = ReminderFactory.createReminder("sms", "Meeting at 10 AM!");

        emailReminder.send();
        smsReminder.send();

        // Tasks are now assigned to users and they get notified!
        manager.addTask(new Task("Submit report by Friday"));
    }
}
