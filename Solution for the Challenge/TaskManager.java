import java.util.ArrayList;
import java.util.List;

// Singleton Pattern: Ensures only ONE instance exists
// Observer Pattern: Users get notified when tasks are added
public class TaskManager {
    private static TaskManager instance; // Single instance
    private List<User> users = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();

    private TaskManager() {} // Private constructor to prevent multiple instances

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task Added: " + task.getDescription());

        // ✅ Observer Pattern: Notify users when a task is added
        for (User user : users) {
            user.receiveReminder("New Task Assigned: " + task.getDescription());
        }
    }
}
