public class CompositeObserver implements Observer{
    private MachineComposite mc;

    public CompositeObserver(MachineComposite mc){
        this.mc = mc;
    }

    @Override
    public void update(boolean broken){
        for(MachineComponent machineComp : mc.getComponents()){

        }
    }
}
