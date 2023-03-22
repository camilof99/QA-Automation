//public class ActionFigure extends Product implements IDiscountRate
public class ActionFigure extends Product {

    private double weightIngrams;
   
    public ActionFigure(String name, String desciption, double price, Discount discount, double weightIngrams) {
		super(name, desciption, price, discount);
		this.weightIngrams = weightIngrams;
	}

	public double getWeight() {
        return weightIngrams;
    }

    public void setWeight(double weightIngrams) {
        this.weightIngrams = weightIngrams;
    }
    
}
