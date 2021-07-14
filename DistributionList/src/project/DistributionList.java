package project;

import LinkedList.*;

/**
 * A distribution list of persons.
 *
 */
public class DistributionList {

	// the inner data structure
	private IList<Person> persons;

	/**
	 * Creates empty distribution list.
	 */
	public DistributionList() {
		
		persons = new LinkedList<Person>();
	}

	/**
	 * Add new person to the distribution list
	 * 
	 * @param person The new person
	 * @return True, if the new person is added. False if it is null or already
	 *         exists.
	 */
	public boolean add(Person person) {
		if(person==null) {
			return false;
		}
		if(persons.contains(person)) {
			return false;
		}
		persons.addLast(person);
		return true;
	}

	/**
	 * Returns a given person if it exists, otherwise returns null.
	 * 
	 * @param person
	 * @return If the given person is found, the given person, otherwise null.
	 */
	public boolean contains(Person person) {
		if(person == null) {
			return false;
		}
		
		if(persons.contains(person)){
			return true ;
		}
		return false;
		}
		
	

	/**
	 * Deletes a given person.
	 * 
	 * @param person
	 * @return True, if the given person is deleted, otherwise false.
	 */
	public boolean remove(Person person1) {
		
		if(persons.remove(person1)) {
			return true;
		}
		return false;
		
		
	}

	@Override
	public String toString() {
		String s =" [persons= {" ;
		for(Person p : persons) {
			s+= p  ; 
		}
		return "DistributionList "+s +"}]";
	}

	/**
	 * Returns a partial distribution list of persons with a given first name.
	 * 
	 * @param firstName
	 * @return
	 */
	public DistributionList getByFirstName(String firstName) {
		
		DistributionList distributionList1 = new DistributionList();
		
		for(Person p : persons) {
			if(p.getName().getFirstName().equals(firstName)) {
				distributionList1.add(p); 
			}
		}
			return distributionList1;
		
		}
	/**
	 * Returns a partial distribution list of persons with a given last name.
	 * 
	 * @param lastName
	 * @return
	 */
	public DistributionList getByLastName(String lastName) {
		
		DistributionList distributionList2 = new DistributionList();
		
		for(Person p : persons) {
			if(p.getName().getLastName().equals(lastName)) {
				distributionList2.add(p); 
			}
		}
			return distributionList2;
		
		}

	/**
	 * Returns a partial distribution list of persons with a given name.
	 * 
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @return
	 */
	public DistributionList getByFullName(String firstName, String middleName, String lastName) {
		
		DistributionList distributionList3 = new DistributionList();
		
		for(Person p : persons) {
			if(p.getName().getFirstName().equals(firstName) &&
					p.getName().getMiddleName().equals(middleName) &&
					p.getName().getLastName().equals(lastName)) {
				distributionList3.add(p); 
			}
		}
			return distributionList3;
		
		}

	/**
	 * Returns a partial distribution list of persons with middle name.
	 * 
	 * @return
	 */
	public DistributionList getIfHasMiddleName() {
		
		DistributionList distributionList4 = new DistributionList();
		
		for(Person p : persons) {
			if(!(p.getName().getMiddleName().equals(""))) {
				distributionList4.add(p); 
			}
		}
			return distributionList4;
		
		}

	/**
	 * Returns a partial distribution list of persons with a given area code.
	 * 
	 * @param areaCode
	 * @return
	 */
	public DistributionList getByArea(String areaCode) {
		
		DistributionList ret = new DistributionList();
		
		for(Person p : persons) {
			if(p.getPhone().getAreaCode().equals(areaCode)) {
				ret.add(p); 
			}
		}
			return ret;
		
		}

	/**
	 * Returns a partial distribution list of persons with a phone number that contains given sequence of
	 * digits.
	 * 
	 * @param digits
	 * @return
	 */
	public DistributionList getIfNumberHasASequenceOfDigits(String digits) {
		
	DistributionList distributionList5 = new DistributionList();
		
		for(Person p : persons) {
			if(p.getPhone().digitString().contains(digits)) {
				distributionList5.add(p); 
			}
		}
			return distributionList5;
		
		}
}
