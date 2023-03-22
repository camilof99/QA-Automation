package principal;


public abstract class Cafe implements ICafe{

	private String strNombre;
	private IAdiciones adiciones;
	private ITypesCafe typesCafe;
	
	public Cafe(String strNombre, IAdiciones adiciones, ITypesCafe typesCafe) {
		super();
		this.adiciones = adiciones;
		this.strNombre = strNombre;
		this.typesCafe = typesCafe;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public IAdiciones getAdiciones() {
		return adiciones;
	}

	public void setAdiciones(IAdiciones adiciones) {
		this.adiciones = adiciones;
	}
	
	public ITypesCafe getTypesCafe() {
		return typesCafe;
	}

	public void setTypesCafe(ITypesCafe typesCafe) {
		this.typesCafe = typesCafe;
	}

	@Override
	public abstract void getInformationCafe();
	
	@Override
	public abstract void getReadyCafe();

}
