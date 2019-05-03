package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Register_page;

public class Register_test {

	@Test
	public void testregister_page() {
		Register_page obj = new Register_page();
		assertEquals(true,obj.calltoOpenHome("newuser", "get626", "8757566", "1234","abc@yaho.com"));
	}

}
