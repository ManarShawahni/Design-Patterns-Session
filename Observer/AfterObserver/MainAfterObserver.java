public class MainAfterObserver {
    public static void main(String[] args) {
        // Creating a YouTube Channel
        YouTubeChannel channel = new YouTubeChannel();

        // Creating subscribers
        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");

        // Users subscribe to the channel
        channel.subscribe(user1);
        channel.subscribe(user2);

        // Uploading a video (All observers get notified automatically)
        channel.uploadVideo("Observer Pattern Explained!");

        // Bob unsubscribes
        channel.unsubscribe(user2);

        // Uploading another video (Only Alice gets notified)
        channel.uploadVideo("Factory Pattern Tutorial");
    }
}
