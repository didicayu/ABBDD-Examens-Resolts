import java.util.ArrayList;
import java.util.List;

public interface Observable {
    List<Observer> observers = new ArrayList<>();

    void addObservers(Observer obs);
    void notifyObservers();
}
