import java.util.ArrayList;
import java.util.List;

public class Item extends Product{

    float price;
    List<Observer> observers;
    
    public Item(float price){
        this.checkNegativeOrZero(price);
        this.price = price;
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    public void setPrice(float newPrice) {
        this.checkNegativeOrZero(newPrice);
        priceChanged = new PriceChanged(this.price, newPrice);
        this.notifyObservers();
        this.price = newPrice;
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this.priceChanged);
        }
    }
}
