public abstract class SLI { // Sale line item
    protected ProductDescription desc;
    protected int quantity;

    public SLI(ProductDescription desc, int quantity){
        this.desc = desc;
        this.quantity = quantity;
    }

    public abstract int subTotal();

    public int getQuantity(){
        return quantity;
    }

    public ProductDescription getDesc(){
        return desc;
    }
}
