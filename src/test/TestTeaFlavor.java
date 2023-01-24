/**
 * @author xbitt = twilkens
 * CIS171 - Spring 2023
 * Jan 24, 2023
 */
package test;
import model.TeaLogic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import model.Teapot;

public class TestTeaFlavor {

	TeaLogic TL = new TeaLogic();
	Teapot teapot = new Teapot("Strawberry Fields");
	
	@Before
	public void setUp() throws Exception {
	}

	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void flavorIsNotNull() {
		assertNotNull(teapot.teaFlavor());
	}
}
