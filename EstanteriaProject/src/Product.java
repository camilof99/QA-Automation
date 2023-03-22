public class Product implements IDiscount{

    private String name;
    private String desciption;
    private double price;
    
    public Product(String name, String desciption, double price) {
        this.name = name;
        this.desciption = desciption;
        this.price = price;
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

    @Override
    public double determineDiscount() {
        return 0.0;
    }

    @Override
    public double determineDiscount(int quantity) {
        return 0.0;
    }

    
 
    
}

   

    

    
