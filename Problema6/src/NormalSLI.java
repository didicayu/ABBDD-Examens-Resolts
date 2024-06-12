public class NormalSLI extends SLI {

    public NormalSLI(ProductDescription desc, int quantity) {
        super(desc, quantity);
    }

    @Override
    public int subTotal(){
        return desc.getPrice() * quantity;
    }
}
