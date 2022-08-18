/**
	 * @Coder: Jarrod Grineau
	 * @Class Name: J_G_NegativeValueException
	 * @Purpose: This is to give an error warning when using a negative number. IT will throw the exception
	 * 			 **Must extend exception to throw the runtime error
	 * @Date: August 7, 2022
	 */
@SuppressWarnings("serial")
public class J_G_NegativeValueException extends Exception{
	
	//variables
	double convertedNumber;
	double negativeNumber;
	
	//inner class
	public J_G_NegativeValueException(double value) {

		negativeNumber = value;
		convertedNumber = Math.abs(value);
	}

	//override toString method to return the error with the correct added math 
	@Override
	public String toString() {

		return "ERROR! " + negativeNumber + " is an invalid number. The input cannot be negative. The " + negativeNumber + " will be converted to " + Math.abs(negativeNumber) + " and be used to continue the calculation";
	}
}
	
	


