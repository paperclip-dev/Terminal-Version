
public class User {
	private String firstName;
	private String lastName;
	
	// class constructor
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// return customer first name
	public String getFirst() {
		return firstName;
	}
	
	// return customer last name
	public String getLast() {
		return lastName;
	}
	
}
