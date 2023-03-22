public class Product {

    private String name;
    private String desciption;
    private double price;
    private Discount discount;
    
    public Product(String name, String desciption, double price, Discount discount) {
		super();
		this.name = name;
		this.desciption = desciption;
		this.price = price;
		this.discount = discount;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
    
    
}

   

    

    
