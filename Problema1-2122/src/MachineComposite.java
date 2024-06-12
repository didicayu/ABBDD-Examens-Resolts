import java.util.ArrayList;
import java.util.List;

public class MachineComposite extends MachineComponent{
    public List<MachineComponent> components = new ArrayList<>();
    public List<Observer> observers = new ArrayList<>();
    public void addComponent(MachineComponent machineComponent){
        components.add(machineComponent);
        observers.add(new CompositeObserver(machineComponent));
    }

    public List<MachineComponent> getComponents(){ return components; }
}
