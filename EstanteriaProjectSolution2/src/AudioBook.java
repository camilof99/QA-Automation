//public class AudioBook extends Product implements IDiscountRate
public class AudioBook extends Product {

    private double durationInHours;

	public AudioBook(String name, String desciption, double price, Discount discount, double durationInHours) {
		super(name, desciption, price, discount);
		this.durationInHours = durationInHours;
	}

	public double getDurationInHours() {
		return durationInHours;
	}

	public void setDurationInHours(double durationInHours) {
		this.durationInHours = durationInHours;
	}

}
