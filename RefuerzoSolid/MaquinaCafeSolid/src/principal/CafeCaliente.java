package principal;

public class CafeCaliente extends Cafe {

	public CafeCaliente(String strNombre, IAdiciones adiciones, ITypesCafe typesCafe) {
		super(strNombre, adiciones, typesCafe);
	}
	
	@Override
	public void getInformationCafe() {
		System.out.println("Estás preparando un rico Café Caliente!");
	}
	
	@Override
	public void getReadyCafe() {
		System.out.println("Estás tomando un rico Café Caliente!");
	}

}
