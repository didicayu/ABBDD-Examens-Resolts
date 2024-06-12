public class FiftyPercentSLI extends SLI{

    public FiftyPercentSLI(ProductDescription desc, int quantity){
        super(desc, quantity);
    }

    @Override
    public int subTotal() {
        int secondUnits = quantity / 2;
        int firstUnits = quantity - secondUnits;
        return firstUnits * desc.getPrice() + (secondUnits * (desc.getPrice()/2));
    }
}
