package project;


/**
 * A person
 * 
 */
public class Person {

	// The name
	private Name name;

	// The phone number
	private Phone phone;

	/**
	 * Trivial constructor.
	 * 
	 * @param name
	 * @param phone
	 */
	public Person(Name name, Phone phone) {
		this.name = name ;
		this.phone = phone ; 
	}

	/**
	 * Returns the name.
	 * @return
	 */
	public Name getName() {
		
		return this.name;
	}


	/**
	 * Returns the phone.
	 * @return
 	 */
	public Phone getPhone() {
		
		return this.phone;
	}

	@Override
	public String toString() {
		
		return "(Person [name="+ name + ", phone="+phone +"])";
	}

	/**
	 * Returns true if the name and the phone are equals, otherwise returns false.
	 */
	@Override
	public boolean equals(Object x) {
		
		if(!(x instanceof Person)) {
			return false;	
		}
		
		Person other = (Person) x ;
		
	return this.name.toString().equals(other.name.toString()) && 
			this.phone.toString().equals(other.phone.toString()) ;	
}
}