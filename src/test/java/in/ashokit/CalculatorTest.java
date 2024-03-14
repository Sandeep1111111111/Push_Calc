package in.ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class CalculatorTest {
	
	@Test
	public void addTest() {
		
		Calculator calc = new Calculator();
		int actualResult = calc.add(33, 22);
		int expectedResult = 55;
		
		assertEquals(expectedResult, actualResult);
	}

}
