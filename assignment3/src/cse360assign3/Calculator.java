package cse360assign3;
/**
 * Class to calculate various mathematical operations
 * 
 * @author Thomas Gottschlich for CSE360 
 * @version Feb 16 2016 
 * @pin 326
 */

public class Calculator 
{

	private int total;
	
	/**
	 *  Creates a calculator with an initial total of zero.
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal - gets total from calculator
	 * 
	 * @return 0
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
	}
	
	/**
	 * subtract - subtracts number from total
	 * 
	 * @param value - int to subtract
	 */
	public void subtract (int value) 
	{
		total -= value;
	}
	
	/**
	 * multiply - multiplies the total by a number
	 * 
	 * @param value - int to multiply by
	 */
	public void multiply (int value) 
	{
		total *= value;
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
	}
	
	/**
	 * getHistory - returns a string (currently an empty string)
	 * 
	 * @return ""
	 */
	public String getHistory () 
	{
		return "";
	}
	
}