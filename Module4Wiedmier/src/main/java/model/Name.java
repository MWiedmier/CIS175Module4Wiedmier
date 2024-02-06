/**
 * @author Mandy Wiedmier - mwiedmier2
 * CIS175 - Spring 2024
 * Feb 6, 2024
 */
package model;

/**
 * 
 */
public class Name {
	private String firstName;
	private String lastName;
	private String fullName;
	
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		formatName(firstName, lastName);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	private void setFullName(String fullName) {
		this.fullName = fullName;
	}

	//Methods
	/**
	 * @param firstName
	 * @param lastName
	 */
	private void formatName(String firstName, String lastName) {
		String hyphen = "-";
		int hyphenIndex;
		String fName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1, firstName.length()).toLowerCase();
		String lName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1, lastName.length()).toLowerCase();
		String fullName;
		
		if(fName.contains(hyphen)){
			hyphenIndex = fName.indexOf(hyphen);
			fName = fName.substring(0, (hyphenIndex + 1)) + fName.substring((hyphenIndex + 1), (hyphenIndex + 2)).toUpperCase() + 
					fName.substring((hyphenIndex + 2), firstName.length());
		}
		
		if(lName.contains(hyphen)){
			hyphenIndex = lName.indexOf(hyphen);
			lName = lName.substring(0, (hyphenIndex + 1)) + lName.substring((hyphenIndex + 1), (hyphenIndex + 2)).toUpperCase() + 
					lName.substring((hyphenIndex + 2), lName.length());
		}
		
		fullName = fName + " " + lName;
		setFullName(fullName);
	}
	
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
