package principal;

public class CafeFrio extends Cafe {

	public CafeFrio(String strNombre, IAdiciones adiciones, ITypesCafe typesCafe) {
		super(strNombre, adiciones, typesCafe);
		
	}

	@Override
	public void getInformationCafe() {
		System.out.println("Estás preparando un rico Café Frio!");
	}

	@Override
	public void getReadyCafe() {
		System.out.println("Estás tomando un rico Café Frio!");
	}
	
	

}
