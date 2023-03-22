package principal;

import java.util.ArrayList;

public class TypesCafe implements ITypesCafe{
	
	ArrayList<String> typesCafe = new ArrayList<String>();

	public TypesCafe(ArrayList<String> typesCafe) {
		super();
		this.typesCafe = typesCafe;
	}

	@Override
	public ArrayList<String> getTypesCafe() {
		return typesCafe;
	}
	
	
}
