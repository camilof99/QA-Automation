package com.sophosolutions.models;

public class InformationData {

	String strFechaEntrada;
	String strFechaSalida;
	String strTextDuracion;
	String strPrecio;
	
	public InformationData(String strFechaEntrada, String strFechaSalida, String strTextDuracion, String strPrecio) {
		super();
		this.strFechaEntrada = strFechaEntrada;
		this.strFechaSalida = strFechaSalida;
		this.strTextDuracion = strTextDuracion;
		this.strPrecio = strPrecio;
	}

	public String getStrFechaEntrada() {
		return strFechaEntrada;
	}

	public void setStrFechaEntrada(String strFechaEntrada) {
		this.strFechaEntrada = strFechaEntrada;
	}

	public String getStrFechaSalida() {
		return strFechaSalida;
	}

	public void setStrFechaSalida(String strFechaSalida) {
		this.strFechaSalida = strFechaSalida;
	}

	public String getStrTextDuracion() {
		return strTextDuracion;
	}

	public void setStrTextDuracion(String strTextDuracion) {
		this.strTextDuracion = strTextDuracion;
	}

	public String getStrPrecio() {
		return strPrecio;
	}

	public void setStrPrecio(String strPrecio) {
		this.strPrecio = strPrecio;
	}

	@Override
	public String toString() {
		return "\nLos datos de tu reserva: \n\nFecha entrada\n" 
				+ "\u001B[32m" + strFechaEntrada + "\u001B[0m"
				+ "\nFecha salida\n" 
				+ "\u001B[34m" + strFechaSalida + "\u001B[0m"
				+ "\nDuración total de la estancia: " + strTextDuracion 
				+ "\u001B[31m" + "\nPrecio =  " + strPrecio + "\u001B[0m";
	}
}
