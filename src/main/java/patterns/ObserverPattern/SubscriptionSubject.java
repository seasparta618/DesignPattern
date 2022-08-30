package patterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer : observerList){
            observer.update(message);
        }
    }
}
