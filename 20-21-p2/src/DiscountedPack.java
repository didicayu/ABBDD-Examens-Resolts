public class DiscountedPack extends Pack {
    private float discount;

    public DiscountedPack(float discount) {
        this.discount = discount;
    }

    public float getPrice(){
        return super.getPrice() * (1f - this.discount);
    }

    public float getDiscount(){
        return discount;
    }

    public void setDiscount(float discount){
        if(!(discount > 0 && discount < 1)){
            throw new IllegalArgumentException("Discount must be between 0 and 1");
        }
        this.discount = discount;
    }
}
