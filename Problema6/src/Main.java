
public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        register.createNewSale();

        Sale sale = register.getSale();
        ProductDescription productDescription = new ProductDescription("Penis de goma", 500, "3x2");
        ProductDescription productDescription2 = new ProductDescription("strap-on", 500, "50%");
        sale.createSalesLineItem(productDescription, 4);
        sale.createSalesLineItem(productDescription2, 15);

    }
}