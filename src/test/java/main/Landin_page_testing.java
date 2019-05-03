package main;

import static org.junit.Assert.assertEquals;
import javax.swing.JButton;

import org.junit.Test;

import main.Landing_page;
import main.Register_page;

public class Landin_page_testing {

	@Test
	public void testlanding_page() {
		Landing_page obj = new Landing_page();

		assertEquals(obj.jf.isVisible(),true);
		assertEquals(obj.jf.isVisible(),true);
		
	}

}
