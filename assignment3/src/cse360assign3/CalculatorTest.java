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
	public void testGetTotal() 
	{
		Calculator calc =  new Calculator(); 
				
		assertEquals(0, calc.getTotal());
	}

	@Test
	//test adding to total
	public void testAdd() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(5);
		
		assertEquals(5, calc.getTotal());
	}
	
	@Test
	//test adding a negative to total
	public void testAddNegative() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(-9);
		
		assertEquals(-9, calc.getTotal());
	}
	
	@Test
	//test subtracting from total
	public void testSubtract() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.subtract(5);
		
		assertEquals(-5, calc.getTotal());
	}
	
	@Test
	//test subtracting a negative from total
	public void testSubtractNegative() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.subtract(-1);
		
		assertEquals(1, calc.getTotal());
	}
	
	@Test
	//test multiplying to total
	public void testMultiply() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(3);
		calc.multiply(3);
		
		assertEquals(9, calc.getTotal());
	}
	
	@Test
	//test multiplying a negative to total
	public void testMultiplyNegative() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(3);
		calc.multiply(-3);
		
		assertEquals(-9, calc.getTotal());
	}
	
	@Test
	//test dividing form total
	public void testDivide() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(3);
		calc.divide(2);
		
		assertEquals(1, calc.getTotal());
	}
	
	@Test
	//test dividing a negative form total
	public void testDivideNegative() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(7);
		calc.divide(-3);
		
		assertEquals(-2, calc.getTotal());
	}
	
	@Test
	//test dividing a negative zero form total
	public void testDivideNegativeZero() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.subtract(3);
		calc.divide(-0);
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	//test dividing by zero
	public void testDivideByZero() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(7);
		calc.divide(0);
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	//test history of add call
	public void testGetHistoryAdd() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(7);
		
		assertEquals("0 + 7", calc.getHistory());
	}
	
	@Test
	//test history of subtract call
	public void testGetHistorySubtract() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.subtract(2);
		
		assertEquals("0 - 2", calc.getHistory());
	}
	
	@Test
	//test history of multiply call
	public void testGetHistoryMultiply() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.multiply(5);
		
		assertEquals("0 * 5", calc.getHistory());
	}
	
	@Test
	//test history of divide call
	public void testGetHistoryDivide() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.divide(0);
		
		assertEquals("0 / 0", calc.getHistory());
	}
	
	@Test
	//test history all function calls
	public void testGetHistoryAll() 
	{
		Calculator calc =  new Calculator(); 
		
		calc.add(7);
		calc.subtract(1);
		calc.divide(2);
		calc.multiply(9);
		
		assertEquals("0 + 7 - 1 / 2 * 9", calc.getHistory());
	}
	
}
