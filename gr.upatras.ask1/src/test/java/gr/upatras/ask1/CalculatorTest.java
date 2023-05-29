package gr.upatras.ask1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	@Test
	void testSubtract() {
		assertEquals("POSITIVE", Calculator.subtract(8, 4));
		assertEquals("NEGATIVE", Calculator.subtract(3, 6));
	}
}