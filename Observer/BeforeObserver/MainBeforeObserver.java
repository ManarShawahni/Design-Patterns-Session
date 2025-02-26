import java.util.ArrayList;
import java.util.List;

// Publisher (YouTube Channel) directly controls all subscribers
class YouTubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestVideo;

    public void uploadVideo(String video) {
        latestVideo = video;
        System.out.println("New Video Uploaded: " + video);
        notifySubscribers();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.receiveNotification(latestVideo);
        }
    }
}

// Subscribers (Users)
class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void receiveNotification(String video) {
        System.out.println(name + " got notified about new video: " + video);
    }
}

// Main class
public class MainBeforeObserver {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();

        // Adding subscribers manually
        Subscriber user1 = new Subscriber("Alice");
        Subscriber user2 = new Subscriber("Bob");

        channel.addSubscriber(user1);
        channel.addSubscriber(user2);

        // Uploading a video (Subscribers get notified directly)
        channel.uploadVideo("Observer Pattern Explained!");
    }
}
