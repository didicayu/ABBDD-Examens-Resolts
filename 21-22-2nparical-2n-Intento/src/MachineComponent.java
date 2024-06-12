public class MachineComponent implements Observable {
    boolean broken;
    public final boolean isBroken(){ return this.broken; }


    @Override
    public void addObservers(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers){
            obs.update(this);
        }
    }
}
