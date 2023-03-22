public class SelfDiscount extends Discount implements IDiscount{

    public double dblDurationSize;

    public SelfDiscount(double dblDurationSize) {
        this.dblDurationSize = dblDurationSize;
    }

    @Override
    public double getDiscount() {
        double discountRate;
        if (dblDurationSize < 100) {
            discountRate = 7;

        } else if (dblDurationSize >= 100 && dblDurationSize <= 350) {
            discountRate = 13;

        } else {
            discountRate = 45;
        }
        return (discountRate / 100);
    }

    public double getDblDurationSize() {
        return dblDurationSize;
    }

    public void setDblDurationSize(double dblDurationSize) {
        this.dblDurationSize = dblDurationSize;
    }
    
}
