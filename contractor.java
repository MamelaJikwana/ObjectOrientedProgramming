//define class name
public class contractor {
	//a class is a template. Eg projects, contractor and architect has a number of attributes namely: name, surname, etc
	//define class variable and data type
	private String name;
	private String surname;
	private int telephoneNumber;
	private String emailAddress;
	private String physicalAddress;
	
	//this is a constructor which we use to initialise the attributes to the values that we specify for each object.
	//we use the keyword 'this' when we are referring to the attributes within the new object.
	public contractor (String name, String surname, int telephoneNumber, String emailAddress, String physicalAddress)
	{
		
		  this.name = name; 
		  this.surname = surname;
		  this.telephoneNumber = telephoneNumber;
		  this.emailAddress = emailAddress;
		  this.physicalAddress = physicalAddress;
		
	}
	//create methods (getters and setters)
	public void setName(String newName) {
		name = newName;
	}
	
	public void setSurname(String newSurname) {
		surname = newSurname;
	}
	
	public void setTelephoneNumber(int newTelephoneNumber) {
		telephoneNumber = newTelephoneNumber;
	}
	
	public void setEmailAddress(String newEmailAddress) {
		emailAddress = newEmailAddress;
	}
	public void setPhysicalAddress(String newPhysicalAddress) {
		physicalAddress = newPhysicalAddress;
	}
	
	public String getName() {
		return (name);
	}
	
	public String getSurname() {
		return (surname);
	}
	
	public int getTelephoneNumber() {
		return (telephoneNumber);
	}
	
	public String getEmailAddress() {
		return (emailAddress);
	}
	public String getPhysicalAddress() {
		return (physicalAddress);
	}
	//this method will return a String object that we’ll use outside the class to display the contents of each object.
	public String toString() {
		String output = "Contractor Name: " + name;
		output += "\nContractor Surname: " + surname;
		output += "\nContractor Telephone Number: " + telephoneNumber;
		output += "\nContractor Email Address: " + emailAddress;
		output += "\nContractor Physical Address: " + physicalAddress;

		return output;
	}
}