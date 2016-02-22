package cse360assign3;
/**
 * Class to calculate various mathematical operations as well as track history of
 * operations made.
 * 
 * @author Thomas Gottschlich for CSE360 
 * @version Feb 16 2016 
 * @pin 326
 */

public class Calculator 
{

	private int total;
	private String history;
	
	/**
	 *  Creates a calculator with an initial total of zero.
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * getTotal - gets total from calculator
	 * 
	 * @return total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * add - adds number to total
	 * 
	 * @param value - int to add
	 */
	public void add (int value) 
	{
		total += value;
		history += " + " + value;
	}
	
	/**
	 * subtract - subtracts number from total
	 * 
	 * @param value - int to subtract
	 */
	public void subtract (int value) 
	{
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * multiply - multiplies the total by a number
	 * 
	 * @param value - int to multiply by
	 */
	public void multiply (int value) 
	{
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * divide - divides the total by a number
	 * 
	 * @param value - int to divide by
	 */
	public void divide (int value) 
	{
		if (value ==  0)
			total = 0;
		else
			total /= value;
		
		history += " / " + value;
	}
	
	/**
	 * getHistory - returns a string of mathematical operations made on total
	 * 
	 * @return history - operation history 
	 */
	public String getHistory () 
	{
		return history;
	}
	
}