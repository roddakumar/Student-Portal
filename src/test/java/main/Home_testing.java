package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Home;

public class Home_testing {

	@Test
	public void testhome() {
		Home obj = new Home();
		assertEquals(obj.f.isVisible(),true);
	}

}
