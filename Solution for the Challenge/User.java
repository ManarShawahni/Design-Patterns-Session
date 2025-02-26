// Observer Pattern: Users receive notifications when tasks are added
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void receiveReminder(String message) {
        System.out.println(name + " received reminder: " + message);
    }
}
