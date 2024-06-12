public class ProductDescription {
    private String description;
    private int price;
    private String type;

    public ProductDescription(String description, int price, String type) {
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice(){
        return price;
    }

    public String getType(){
        return type;
    }
}
