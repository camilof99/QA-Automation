public class AmmountDiscount extends Discount implements IDiscount{

    public int quantity;

    public AmmountDiscount(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getDiscount() {
        double discountRate;
        if (quantity < 3) {
            discountRate = 10;
        } else if (quantity >= 3 && quantity >= 10) {
            discountRate = 15;
        } else {
            discountRate = 20;
        }
        return (discountRate / 100);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
