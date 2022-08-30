package patterns.ObserverPattern;

public class YoutubeUser implements Observer {

    private String name;

    public YoutubeUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " received message " + message);
    }
}
