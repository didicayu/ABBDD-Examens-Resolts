public class Machine extends MachineComponent{

    public void setBroken(){
        broken = true;
        notifyObservers();
    }

    public void repair(){
        broken = false;
        notifyObservers();
    }
}
