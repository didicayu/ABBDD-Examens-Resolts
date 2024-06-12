// Observer
public class Register implements Observer{
    //private Store tenda;
    private Sale currentSale;
    public Register(/* Store store */){
        // tenda = store;
    }

    public void createNewSale(){
        currentSale = new Sale();
        currentSale.addObserver(this);
    }

    public Sale getSale(){
        return currentSale;
    }

    @Override
    public void update(SLI subject){
        // nom, preu unitari, quantitat total
        String productDesc = subject.getDesc().getDescription();
        int quantity = subject.getQuantity();
        int subtotal = subject.subTotal();
        System.out.println("Product name: " + productDesc + ", Quantity: " + quantity + ", Subtotal: " + subtotal);
    }
}
