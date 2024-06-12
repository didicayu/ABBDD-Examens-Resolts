import java.util.HashSet;
import java.util.Set;

public class Machine extends MachineComponent{

    public void setBroken(){
        this.broken = true;
        notifyObservers();
    }
    public void repair(){
        this.broken = false;
        notifyObservers();
    }
}
