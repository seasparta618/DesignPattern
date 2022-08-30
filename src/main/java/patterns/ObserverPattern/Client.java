package patterns.ObserverPattern;

import org.junit.Test;

public class Client {
    @Test
    public void test() {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        subscriptionSubject.attach(new YoutubeUser("Leon"));
        subscriptionSubject.attach(new YoutubeUser("Lion"));
        subscriptionSubject.attach(new YoutubeUser("Liang"));

        subscriptionSubject.notify("I have posted a new video! Video name is RingKing");
    }
}
