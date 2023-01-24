package model;

/**
 * @author xbitt = twilkens
 * CIS171 - Spring 2023
 * Jan 24, 2023
 */


public class TeaLogic {
	
	public boolean isTeaReady(Teapot teapot) {
		if(teapot.getTeaTemp() == "hot") {
			return true;
		}else {
			return false;
		}
	}
	
	public int cupsOfTeaServing(Teapot teapot) {
		return teapot.getCupsOfTea();	
	}

	
}
