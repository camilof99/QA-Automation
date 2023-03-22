package principal;

import java.util.ArrayList;

public class Maquina {

	private ArrayList<Cafe> listCafe;

	public Maquina() {
		super();
		this.listCafe = new ArrayList<Cafe>();
	}
	
	public void addCafe(Cafe cafe) {
		listCafe.add(cafe);
	}
	
	public void cafe() {

		System.out.println("Qué Café desea:");
		int intIndex = 1;
		for (Cafe cafe : listCafe) {
			System.out.println(intIndex + ". " + cafe.getStrNombre());
			intIndex++;
		}
	}
	
	public void typeCafe(int opcion) {

		listCafe.get(opcion).getInformationCafe();
		
		System.out.println("Qué tipo de café desea:");
		int intIndex = 1;
		
		for (String adicion : listCafe.get(opcion).getTypesCafe().getTypesCafe()) {
			System.out.println(intIndex + ". " + adicion);
			intIndex++;
		}
	}
	
	public void typeAdition(int opcion) {
		
		listCafe.get(opcion).getInformationCafe();
		
		System.out.println("Qué adición desea:");
		int intIndex = 1;
		
		for (String adicion : listCafe.get(opcion).getAdiciones().getListAdiciones()) {
			System.out.println(intIndex + ". " + adicion);
			intIndex++;
		}
		
	}

	public ArrayList<Cafe> getListCafe() {
		return listCafe;
	}

	public void setListCafe(ArrayList<Cafe> listCafe) {
		this.listCafe = listCafe;
	}
	
}
