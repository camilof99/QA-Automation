package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

	public static void main(String[] args) {
		
		IAdiciones adiciones = new Adiciones(listAdicionesCafe());
		ITypesCafe typeCafeCaliente = new TypesCafe(listTypeCafeCaliente());
		ITypesCafe typeCafefrio = new TypesCafe(listTypeCafeFrio());
		
		Cafe cafeFrio = new CafeFrio("Café Frio", adiciones, typeCafefrio);
		Cafe cafeCaliente = new CafeCaliente("Café Caliente", adiciones, typeCafeCaliente);
		
		Maquina maquina = new Maquina();
		maquina.addCafe(cafeCaliente);
		maquina.addCafe(cafeFrio);
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
		
			System.out.println("Maquina de Café");
			maquina.cafe();
			System.out.println("3. Salir");
			opcion = sc.nextInt() - 1;
			
			//maquina.getListCafe().get(opcion).getInformationCafe();
			maquina.typeCafe(opcion);
			
			int opcion1 = sc.nextInt() - 1;
			
			maquina.typeAdition(opcion1);
			
			int opcion2 = sc.nextInt() - 1;
			
			pedidos.add( new Pedido(maquina.getListCafe().get(opcion).getStrNombre(), 
					maquina.getListCafe().get(opcion).getTypesCafe().getTypesCafe().get(opcion1), 
					maquina.getListCafe().get(opcion).getAdiciones().getListAdiciones().get(opcion2)));

			System.out.print("Desea para el momento? : ");
			System.out.println("\n1. Si");
			System.out.println("2. No");
			int y = sc.nextInt();
			
			if(y==1) {
				maquina.getListCafe().get(opcion).getReadyCafe();
				System.out.println("Adición: " + maquina.getListCafe().get(opcion).getTypesCafe().getTypesCafe().get(opcion1));
			}else {
				System.out.println("\nTu pedido fue:");
				for(Pedido pedido: pedidos) {
					System.out.println("\n" + pedido.getStrTipoCafe());
					System.out.println(pedido.getStrAdicion());
				}
				break;
			}
			
			System.out.print("Desea pedir un nuevo café? : ");
			System.out.println("\n1. Si");
			System.out.println("2. No");
			int x = sc.nextInt();
			
			if(x==1) {
				opcion = 0;
			}else {
				opcion = 3;
			}
			

		} while (opcion != 3);
		
		System.out.println("\nTu pedido fue:");
		for(Pedido pedido: pedidos) {
			System.out.println("\n" + pedido.getStrCafe());
			System.out.println(pedido.getStrTipoCafe());
			System.out.println(pedido.getStrAdicion());
		}
		System.out.println("Gracias por su compra!");
	}
	
	public static ArrayList<String> listTypeCafeFrio(){
		ArrayList<String> listAdicionesCafeFrio = new ArrayList<String>();
		listAdicionesCafeFrio.add("Ice Cappuccino");
		listAdicionesCafeFrio.add("Shakerato");
		listAdicionesCafeFrio.add("Cold Brew");
		
		return listAdicionesCafeFrio;
	}
	
	public static ArrayList<String> listTypeCafeCaliente(){
		ArrayList<String> lisAdicionesCafeCaliente = new ArrayList<String>();
		lisAdicionesCafeCaliente.add("Espresso");
		lisAdicionesCafeCaliente.add("Macchiato");
		lisAdicionesCafeCaliente.add("Capuchino");
		
		return lisAdicionesCafeCaliente;
	}
	
	public static ArrayList<String> listAdicionesCafe(){
		ArrayList<String> listAdiciones = new ArrayList<String>();
		listAdiciones.add("Azucar");
		listAdiciones.add("Crema");
		listAdiciones.add("Chocolate");
		
		return listAdiciones;
	}

}
