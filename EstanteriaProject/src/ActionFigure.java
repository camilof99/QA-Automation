//public class ActionFigure extends Product implements IDiscountRate
public class ActionFigure extends Product {

    private double weightIngrams;
   
    public ActionFigure(String name, String desciption,  double weight, double price) {
        super(name, desciption, price);
        this.weightIngrams = weight;
    }

    public double getWeight() {
        return weightIngrams;
    }

    public void setWeight(double weightIngrams) {
        this.weightIngrams = weightIngrams;
    }



    @Override
    public double determineDiscount() {
        double discountRate;
        if(weightIngrams < 100)
        {
          discountRate = 7;
             
        }else if(weightIngrams >= 100 && weightIngrams <= 350)
        {
             discountRate = 13;
 
        }else{
         discountRate = 45;
        }
        return (discountRate/100); 
    }



        
}
