package cse360assign3;

public class Calculator {
	/** Total for the calculator value*/
	private int total;
	/** History of actions */
	private String history;
	
	/** Constructor for class calculator, initializing total to zero
	 * 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "" + 0;
	}
	
	/** GetTotal returns the total of the calculator
	 * 
	 * @return					Returns to total
	 */
	public int getTotal () {
		return total;
	}
	
	/** Adds a value to the total of class calculator
	 * 
	 * @param value				Value to be added
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/** Subtracts a value from the total
	 * 
	 * @param value				Value to be subtracted from total
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/** Multiplies total by given value
	 * 
	 * @param value				Value to be multiplied to total
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/** Divides total by given value
	 * 
	 * @param value				Value to be divided into total
	 */
	public void divide (int value) {
		history = history + " / " + value;
		if (value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/**	Prints the history applied to the total
	 * 
	 * @return					Returns history of functions
	 */
	public String getHistory () {
		return history;
	}
}
