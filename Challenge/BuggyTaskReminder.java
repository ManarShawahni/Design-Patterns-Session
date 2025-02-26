// X Problem: Multiple instances of TaskManager are created
public class BuggyTaskReminder {
    public static void main(String[] args) {
        BuggyTaskManager manager1 = new BuggyTaskManager();
        BuggyTaskManager manager2 = new BuggyTaskManager();

        BuggyUser user1 = new BuggyUser("Alice");
        BuggyUser user2 = new BuggyUser("Bob");

        // X Problem: Users are added but never assigned tasks
        manager1.addUser(user1);
        manager2.addUser(user2);

        // X Problem: Manual task creation instead of using Factory pattern
        BuggyEmailReminder emailReminder = new BuggyEmailReminder("Complete your profile!");
        BuggySMSReminder smsReminder = new BuggySMSReminder("Meeting at 10 AM!");

        emailReminder.send();
        smsReminder.send();

        // X Problem: Users are not notified when tasks are added
        manager1.addTask(new BuggyTask("Submit report by Friday"));
    }
}
