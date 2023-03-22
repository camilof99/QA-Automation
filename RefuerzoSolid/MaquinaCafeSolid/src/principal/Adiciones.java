package principal;

import java.util.ArrayList;

public class Adiciones implements IAdiciones{
	
	ArrayList<String> listAdiciones = new ArrayList<String>();

	public Adiciones(ArrayList<String> listAdiciones) {
		super();
		this.listAdiciones = listAdiciones;
	}

	@Override
	public ArrayList<String> getListAdiciones() {
		return listAdiciones;
	}

}
