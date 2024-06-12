import java.util.HashSet;
import java.util.Set;

public class MachineComponent implements Observable{
    public Set<Observer> observerSet = new HashSet<>();
    protected boolean broken = false;
    public final boolean isBroken(){
        return this.broken;
    }
    @Override
    public void addObserver(Observer obs) {
        observerSet.add(obs);
    }

    @Override
    public void deleteObserver(Observer obs) {
        observerSet.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs : observerSet){
            obs.update();
        }
    }
}
