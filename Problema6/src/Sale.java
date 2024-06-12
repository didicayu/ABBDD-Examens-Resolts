import java.util.ArrayList;
import java.util.List;

// Subject
public class Sale {
    private List<SLI> lines = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private SLI currentSaleLine;

    public void createSalesLineItem(ProductDescription desc, int quantity){
        SLI sli = createSLI(desc, quantity);
        this.currentSaleLine = sli;
        lines.add(sli);
        notifyObservers();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(currentSaleLine);
        }
    }

    public SLI createSLI(ProductDescription desc, int quantity){
        String type = desc.getType();

        return switch (type) {
            case "3x2" -> new ThreeForTwoSLI(desc, quantity);
            case "50%" -> new FiftyPercentSLI(desc, quantity);
            default -> new NormalSLI(desc, quantity);
        };
    }
}
