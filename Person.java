//class Person
public class Person {
	String firstName;
	String lastName;
	int telNumber;
	String email;
	String address;
	
	//Constructor
	public Person(String firstName, String lastName,int telNumber ,String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.telNumber = telNumber;
		this.email = email;
		this.address = address;
	}
	
	//toString method
	public String toString() {
		String result = "Name: " + firstName;
		result += "\nSurname: " + lastName;
		result += "\nTelephone number: " + telNumber;
		result += "\nEmail address: " + email;
		result += "\nPhysical address: " + address;
		
		return result;
	}
}


