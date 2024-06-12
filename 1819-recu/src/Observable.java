import java.util.ArrayList;
import java.util.List;

public interface Observable {
    List<Observer> observers = new ArrayList<>();

    default void addObserver(Observer observer){
        observers.add(observer);
    }
    default void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }
}
