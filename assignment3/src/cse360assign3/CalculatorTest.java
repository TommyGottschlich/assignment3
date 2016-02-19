package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	@Test
	//test calc is not null
	public void testCalculator() 
	{
		Calculator calc =  new Calculator(); 
		
		assertNotNull(calc);
	}
	
	@Test
	//test total 
	public void getTotal() 
	{
		Calculator calc =  new Calculator(); 
				
		assertEquals(0, calc.getTotal());
	}

	@Test
	//test adding to total
	public void add() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(5);
		
		assertEquals(5, calc.getTotal());
	}
	
	@Test
	//test subtracting from total
	public void subtract() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.subtract(5);
		
		assertEquals(-5, calc.getTotal());
	}
	
	@Test
	//test multiplying to total
	public void multiply() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(3);
		calc.multiply(3);
		
		assertEquals(9, calc.getTotal());
	}
	
	@Test
	//test dividing form total
	public void divide() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.subtract(3);
		calc.divide(2);
		
		assertEquals(-1, calc.getTotal());
	}
	
	@Test
	//test dividing by zero
	public void divideByZero() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(7);
		calc.divide(0);
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	//test history of function calls
	public void getHistory() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(7);
		calc.subtract(1);
		calc.divide(2);
		calc.multiply(9);
		
		assertEquals("0 + 7 - 1 / 2 * 9", calc.getHistory());
	}
	
}
