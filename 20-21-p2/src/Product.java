public abstract class Product implements Observable{
    abstract float getPrice();
    PriceChanged priceChanged;

    void checkNegativeOrZero(float value){
        if(value <= 0){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(priceChanged);
        }
    }
}
