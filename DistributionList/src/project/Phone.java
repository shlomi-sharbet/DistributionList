package project;

/**
 * A phone number
 *
 */
public class Phone {

	// the area (like 02, 03, 05 ...)
	private String areaCode;
	
	// the number
	private int number;

	// trivial constructor
	public Phone(String areaCode, int number) {

		this.areaCode = areaCode ;
		this.number = number ; 
	}
	
	// returns the area
	public String getAreaCode() {
		
		return this.areaCode;
	}
	
	// returns the number
	public int getNumber() {
		
		return this.number;
	}
	
	

	@Override
	public String toString() {
		
		
		return "("+areaCode+")" + number/1000 +"-"+ number%1000 ;
	}
	
	public String digitString() {
		
		
		return "" + number ;
	}
}
