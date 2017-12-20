package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import logic.Main;

public class MainTester {

	@Test
	public void test() {
		Main m = new Main();
		
		assertEquals("... --- ...", m.alphaToMorse("sos"));
	}

}
