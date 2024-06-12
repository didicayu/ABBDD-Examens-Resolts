import java.util.ArrayList;
import java.util.List;

public interface Observable {
    List<Observer> observers = new ArrayList<Observer>();

    void addObserver(Observer observer);
    void notifyObservers();
}
