//public class PhysicalBook extends Product implements IDiscountQuantity
public class PhysicalBook extends Product{

    private int pages;

	public PhysicalBook(String name, String desciption, double price, Discount discount, int pages) {
		super(name, desciption, price, discount);
		this.pages = pages;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
