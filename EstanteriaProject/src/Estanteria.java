import java.util.ArrayList;

public class Estanteria {

    private static ArrayList <Product> productList = new ArrayList<>();


    public static void addBook(Product product)
    {
        productList.add(product);

    }

    public static void sortBookList()
    {
        for (Product product : productList) {
            System.out.println( product.getName()+" " +product.getDesciption());
        }
    }

    public static void getBooksTotalPages()
    {
        int totalPages=0;
        for (Product product : productList) {

            if(product instanceof PhysicalBook)
            {
                PhysicalBook phyBook =(PhysicalBook)product;
                totalPages += phyBook.getPages();
            }
            
        }

        System.out.println( "The book has"+" " + totalPages +" pages");
    }

    public static ArrayList<Product> getProducts(){
        return productList;
    }

    

    
    
}
