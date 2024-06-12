import java.util.Observable;

public class MachineObserver implements Observer{
    private Machine machine;

    public MachineObserver(Machine machine){
        this.machine = machine;
        this.machine.attach(this);
    }

    public void update(boolean broken){

    }
}
