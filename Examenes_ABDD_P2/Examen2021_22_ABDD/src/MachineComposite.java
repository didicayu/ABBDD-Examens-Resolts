import java.util.ArrayList;
import java.util.List;

public class MachineComposite extends MachineComponent implements Observer{
    public List<MachineComponent> componentList = new ArrayList<>();
    public void addComponent(MachineComponent mc){
        this.componentList.add(mc);
        mc.addObserver(this);
        update();
    }

    @Override
    public void update(){
        boolean actualBroken = false;
        for (MachineComponent comp : componentList) {
            if(comp.isBroken()){
                actualBroken = true;
            }
            break;
        }
        this.broken = actualBroken;
        System.out.println("Se esta realizando un update :)");
    }
}
