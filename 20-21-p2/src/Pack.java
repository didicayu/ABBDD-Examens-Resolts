import java.util.ArrayList;
import java.util.List;

public class Pack extends Product{

    private List<Product> products;
    private float totalPrice;
    public Pack(){
        totalPrice = 0f;
        products = new ArrayList<Product>();
    }

    @Override
    public float getPrice() {
        return this.totalPrice;
    }

    public void addProduct(Product p){
        products.add(p);

    }

    // P1 -> p1 (2 -> 3), p2 (4 -> 10)
    @Override
    public void update(PriceChanged priceChanged) {
        float currentTotal = 0;
        for (Product p : products){
            currentTotal += p.getPrice();
        }
        this.totalPrice += currentTotal;
        System.out.println("Price of Product changed! -> old price: " + priceChanged.getOldPrice() + " new price: " + priceChanged.getNewPrice());
        System.out.println("New Pack Price: " + this.totalPrice);
    }
}
