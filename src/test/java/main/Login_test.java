package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Login_page;

public class Login_test {

	@Test
	public void testlogin_page() {
		Login_page obj = new Login_page();
		assertEquals(true,obj.validateData("user", "pass"));

		
	}

}
