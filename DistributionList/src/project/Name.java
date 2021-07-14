package project;

/**
 * A name
 *
 */
public class Name {

	// the first name
	private String firstName;
	
	// the middle name
	private String middleName;
	
	// the last name
	private String lastName;

	// trivial constructor
	public Name(String firstName, String middleName, String lastName) {
		
		this.firstName =firstName ; 
		this.middleName = middleName; 
		this.lastName = lastName ; 

	}

	// constructor with no middle name
	public Name(String firstName, String lastName) {
		
		this.firstName =firstName ;
		this.middleName =""; 
		this.lastName = lastName ; 
	}

	// returns the first name
	public String getFirstName() {
		
		return this.firstName;
	}

	// returns the middle name
	public String getMiddleName() {
		   
		return this.middleName;
	}

	// returns the last name
	public String getLastName() {
		
		return this.lastName;
	}

	@Override
	public String toString() {
		if(middleName=="") {
			return  firstName +" "+ lastName;
		}
		return  firstName+ " " +middleName+ " " + lastName;
	}
	
	
}
