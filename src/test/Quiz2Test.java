package test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class MonthlyPayTest {

	@Test
	public void testMonthlyPay() {
		Junit test = new Junit();
		double result = test.MonthlyPay(35000,.10,60);
		assertEquals(743.65,result);
	}

}
