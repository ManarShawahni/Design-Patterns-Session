// Concrete Observer (Subscriber)
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String video) {
        System.out.println(name + " got notified about new video: " + video);
    }
}
