package principal;

public class Pedido {
	private String strCafe;
	private String strTipoCafe;
	private String strAdicion;
	
	public Pedido(String strCafe, String strTipoCafe, String strAdicion) {
		super();
		this.strCafe = strCafe;
		this.strTipoCafe = strTipoCafe;
		this.strAdicion = strAdicion;
	}

	public String getStrTipoCafe() {
		return strTipoCafe;
	}

	public void setStrTipoCafe(String strTipoCafe) {
		this.strTipoCafe = strTipoCafe;
	}

	public String getStrAdicion() {
		return strAdicion;
	}

	public void setStrAdicion(String strAdicion) {
		this.strAdicion = strAdicion;
	}

	public String getStrCafe() {
		return strCafe;
	}

	public void setStrCafe(String strCafe) {
		this.strCafe = strCafe;
	}
}
