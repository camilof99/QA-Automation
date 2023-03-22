//public class PhysicalBook extends Product implements IDiscountQuantity
public class PhysicalBook extends Product{

    private int pages;

    public PhysicalBook(String name, String desciption, int pages, double price) {
        super(name, desciption, price);
        this.pages = pages;
        //TODO Auto-generated constructor stub
    }

    public int getPages() {
        return pages;
    }

    @Override
    public double determineDiscount(int quantity) {
        double discountRate;
        if (quantity < 3)
        {
            discountRate = 10;
        }else if(quantity >= 3 && quantity >= 10)
        {
            discountRate = 15;
        }else{
            discountRate = 20;
        }
        return(discountRate/100);
    }

  

   
    
    
}
