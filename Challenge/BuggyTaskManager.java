import java.util.ArrayList;
import java.util.List;

// X Problem: No Singleton, multiple instances can be created
public class BuggyTaskManager {
    private List<BuggyUser> users = new ArrayList<>();
    private List<BuggyTask> tasks = new ArrayList<>();

    public BuggyTaskManager() {} // X Should not allow multiple instances

    public void addUser(BuggyUser user) {
        users.add(user);
    }

    public void addTask(BuggyTask task) {
        tasks.add(task);
        // X Trick Issue: Tasks are added but never assigned to users
        System.out.println("Task Added: " + task.getDescription());
    }
}
