import java.util.ArrayList;
import java.util.List;

// Subject (Publisher)
class YouTubeChannel {
    private List<Observer> observers = new ArrayList<>();
    private String latestVideo;

    // Subscribe observer
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    // Unsubscribe observer
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    // Upload a new video
    public void uploadVideo(String video) {
        latestVideo = video;
        System.out.println("New Video Uploaded: " + video);
        notifyObservers();
    }

    // Notify all observers
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestVideo);
        }
    }
}
