package model;
/**
 * @author xbitt = twilkens
 * CIS171 - Spring 2023
 * Jan 24, 2023
 */


public class Teapot {
	private String teaLeafFlavor;
	private boolean teaReady;
	private int cupsOfTea;
	private String teaTemp;
	
	public Teapot(String teaLeafFlavor) {
		this.teaLeafFlavor = teaLeafFlavor;
	}
	
	
	public String getTeaLeafFlavor() {
		return teaLeafFlavor;
	}
	public void setTeaLeafFlavor(String teaLeafFlavor) {
		this.teaLeafFlavor = teaLeafFlavor;
	}
	public boolean isTeaReady() {
		return teaReady;
	}
	public void setTeaReady(boolean teaReady) {
		this.teaReady = teaReady;
	}
	public int getCupsOfTea() {
		return cupsOfTea;
	}
	public void setCupsOfTea(int cupsOfTea) {
		this.cupsOfTea = cupsOfTea;
	}
	
	
	public String getTeaTemp() {
		return teaTemp;
	}


	public void setTeaTemp(String teaTemp) {
		this.teaTemp = teaTemp;
	}


	public String teaFlavor() {
		return teaLeafFlavor;
	}
	
}
