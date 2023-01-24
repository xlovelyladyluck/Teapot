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


public class TestGeneralTea1 {

	TeaLogic TL = new TeaLogic();
	Teapot teapot = new Teapot("Love Spell");
	
	@Before
	public void setUp() throws Exception {
	}

	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCupsOfTea() {
		teapot.setCupsOfTea(2);
		int cupsOfTea = TL.cupsOfTeaServing(teapot);
		assertEquals(2, cupsOfTea);
		
	}

}
