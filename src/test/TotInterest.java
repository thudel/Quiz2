package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TotInterest {

	@Test
	public static void testInterst() {
		Junit test = new Junit();
		double result = test.Interst(.10,60);
		assertEquals(9618.79,result);
		
	}

}
