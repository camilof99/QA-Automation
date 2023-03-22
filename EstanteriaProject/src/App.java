import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
     
        menu();
       
    }

    public static void menu() throws InterruptedException, IOException {

		PhysicalBook physicalBook1 = new PhysicalBook("librofisico1", "descripcion1", 27, 2000);
		Estanteria.addBook(physicalBook1);

		AudioBook audioBook1 = new AudioBook("libroaudio1", "descripcion3", 185.3, 15000);
		Estanteria.addBook(audioBook1);

		ActionFigure actionFigure = new ActionFigure("libroaudio1", "descripcion3", 185.3, 50000);
		Estanteria.addBook(actionFigure);

		Scanner sc = new Scanner(System.in);


		int opcion = 0;
		do {
		
			System.out.println("BIENVENIDO");
			System.out.println("Que desea cotizar?");
			System.out.println("1. Audio libro ");
			System.out.println("2. Libro Fisico");
			System.out.println("3. Figura de accion");
			System.out.println("4. Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1: {
				System.out.println("El costo original es " + audioBook1.getPrice());
				System.out.println("El descuento es de " + audioBook1.determineDiscount() * 100 + "%");
				System.out.println("El costo total es "
						+ (audioBook1.getPrice() - audioBook1.determineDiscount() * audioBook1.getPrice()));
				break;
			}
			case 2: {
				System.out.println("Que cantidad desea llevar?");
				
				int cantidad = sc.nextInt();
				
				double totalCompra = (physicalBook1.getPrice()*cantidad);
				
				System.out.println("El costo original es " + physicalBook1.getPrice()*cantidad);
				System.out.println("El descuento es de " + physicalBook1.determineDiscount(cantidad) * 100 + "%");
				System.out.println("El costo total es " + (totalCompra
						- physicalBook1.determineDiscount(cantidad) * totalCompra));
				break;
			}
			case 3: {
				System.out.println("El costo original es " + actionFigure.getPrice());
				System.out.println("El descuento es de " + actionFigure.determineDiscount() * 100 + "%");
				System.out.println("El costo total es "
						+ (actionFigure.getPrice() - actionFigure.determineDiscount() * actionFigure.getPrice()));
				break;
			}
            default:{
                System.out.println("¡Opción no valida: Ingrese una opción correcta!");
               
            }

			}
			
		   
		} while (opcion != 4);
	}

}
