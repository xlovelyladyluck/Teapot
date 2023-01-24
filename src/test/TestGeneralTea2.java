/**
 * @author xbitt = twilkens
 * CIS171 - Spring 2023
 * Jan 24, 2023
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.TeaLogic;
import model.Teapot;


public class TestGeneralTea2 {
	TeaLogic TL = new TeaLogic();
	Teapot teapot = new Teapot("Spiced Chai Masala");
	
	@Before
	public void setUp() throws Exception {
	}

	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMoreCupsOfTea() {
		teapot.setCupsOfTea(4);
		int cupsOfTea = TL.cupsOfTeaServing(teapot);
		assertEquals(4, cupsOfTea);
	}

}
