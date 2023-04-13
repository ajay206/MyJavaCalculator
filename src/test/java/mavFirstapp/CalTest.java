
package mavFirstapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void testsum() {
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.sum(2, 2));
	}
			
			@Test
			public void testMinus() {
				Calculator calculator = new Calculator();
				assertEquals(0, calculator.sub(2, 2));
			}

			
			@Test
			public void testDivide() {
				Calculator calculator = new Calculator();
				assertEquals(2, calculator.div(6, 3));
			}
			
			@Test
			public void testMultiply() {
				Calculator calculator = new Calculator();
				assertEquals(4, calculator.mul(2, 2));
			}
	}
