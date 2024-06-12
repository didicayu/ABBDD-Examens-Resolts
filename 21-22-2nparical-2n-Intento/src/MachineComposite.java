import java.util.ArrayList;
import java.util.List;

public class MachineComposite extends MachineComponent implements Observer{

    List<MachineComponent> components = new ArrayList<>();
    public void addComponent(MachineComponent mc) {
        components.add(mc);
        mc.addObservers(this);
        mc.notifyObservers();
    }

    @Override
    public void update(MachineComponent mc){
        for(MachineComponent comp : components){
            if(comp.isBroken()){
                this.broken = true;
                return;
            }
        }
        this.broken = false;
    }
}
