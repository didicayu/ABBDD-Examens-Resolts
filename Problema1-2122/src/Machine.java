import java.util.ArrayList;
import java.util.List;

public class Machine extends MachineComponent{
    private List<Observer> observers = new ArrayList<>();

    public void setBroken(){
        this.broken = true;
        this.notifyAllObservers();
    }

    public void repair(){
        this.broken = false;
        this.notifyAllObservers();
    }

    public void attach(Observer obs){
        observers.add(obs);
    }

    public void notifyAllObservers(){
        for(Observer obs : observers){
            obs.update(this.broken);
        }
    }
}
