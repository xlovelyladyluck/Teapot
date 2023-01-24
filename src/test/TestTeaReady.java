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


public class TestTeaReady {

	TeaLogic TL = new TeaLogic();
	Teapot teapot = new Teapot("Lady Lavender");
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTeaIsHot() {
		teapot.setTeaTemp("hot");
		assertTrue(teapot.isTeaReady());
	}
	
	@Test
	public void testTeaIsNotHot() {
		teapot.setTeaTemp("cold");
		assertFalse(teapot.isTeaReady());
	}
}
