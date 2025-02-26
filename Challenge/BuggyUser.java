// X Problem: Observer pattern is missing
public class BuggyUser {
    private String name;

    public BuggyUser(String name) {
        this.name = name;
    }

    public void receiveReminder(String message) {
        // X This method is never called
        System.out.println(name + " received reminder: " + message);
    }
}
