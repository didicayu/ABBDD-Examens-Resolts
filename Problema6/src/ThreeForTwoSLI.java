public class ThreeForTwoSLI extends SLI{
    public ThreeForTwoSLI(ProductDescription desc, int quantity) {
        super(desc, quantity);
    }

    @Override
    public int subTotal() {
        int saved = quantity / 3;
        return desc.getPrice() * (quantity - saved);
    }


}
