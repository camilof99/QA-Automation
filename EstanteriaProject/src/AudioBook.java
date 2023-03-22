//public class AudioBook extends Product implements IDiscountRate
public class AudioBook extends Product {

    private double durationInHours;

    public AudioBook(String name, String desciption, double duration, double price) {
        super(name, desciption, price);
        this.durationInHours  = duration;
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public double determineDiscount() {

        double discountRate;
       if(durationInHours < 3.0)
       {
         discountRate = 5;
            
       }else if(durationInHours >= 3.0 && durationInHours <= 10.0)
       {
            discountRate = 15;

       }else{
        discountRate = 30;
       }
       return (discountRate/100);
    }

   
    
}
