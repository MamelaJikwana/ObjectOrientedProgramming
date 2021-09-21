//define class name
public class Projects {
	//a class is a template. Eg projects, contractor and architect has a number of attributes namely: project number, building type, etc
	//define class variable and data type
	
	private String projectNumber;
	private String projectName;
	private String builingType;
	private String projectPhysicalAddress;
	private int erfNumber;
	private double projectFees;
	private double feesPaidToDate;
	private double invoice;
	private String dueDate;
	private String clientName;
	private String clientSurname;
	private int clientTelephoneNumber;
	private String clientEmailAddress;
	private String clientPhysicalAddress;
	private architect architect1;
	private contractor contractor1;
	
	//this is a constructor which we use to initialise the attributes to the values that we specify for each object.
	//we use the keyword 'this' when we are referring to the attributes within the new object.
	public Projects (String projectNumber, String projectName, String builingType, String projectPhysicalAddress, int erfNumber,
			double projectFees, double feesPaidToDate, double invoice, String dueDate, String clientName, String clientSurname, 
			int clientTelephoneNumber, String clientEmailAddress, String clientPhysicalAddress, architect architect1, contractor contractor1) 
	{		
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.builingType = builingType;
		this.projectPhysicalAddress =projectPhysicalAddress;
		this.erfNumber = erfNumber;
		this.projectFees = projectFees;
		this.feesPaidToDate = feesPaidToDate;
		this.invoice = invoice;
		this.dueDate = dueDate;
		this.clientName = clientName;
		this.clientSurname = clientSurname;
		this.clientTelephoneNumber = clientTelephoneNumber;
		this.clientEmailAddress = clientEmailAddress;
		this.clientPhysicalAddress = clientPhysicalAddress;
		this.architect1 = architect1;
		this.contractor1 = contractor1;
	}
	//create methods (getters and setters)
	
	public void setProjectNumber(String newProjectNumber) 
	{
		projectNumber = newProjectNumber;
	}
	
	public void setProjectName(String newProjectName) 
	{
		projectName = newProjectName;
	}
	
	public void setTelephoneNumber(String newBuilingType) 
	{
		builingType = newBuilingType;
	}
	
	public void setProjectPhysicalAddress(String newProjectPhysicalAddress) 
	{
		projectPhysicalAddress = newProjectPhysicalAddress;
	}
	public void setErfNumber(int newErfNumber) 
	{
		erfNumber = newErfNumber;
	}
	
	public void setProjectFees(double newProjectFees) 
	{
		projectFees = newProjectFees;
	}
	public void setFeesPaidToDate(double newFeesPaidToDate) 
	{
		feesPaidToDate = newFeesPaidToDate;
	}
	
	public void setInvoice(double newInvoice) 
	{
		invoice = newInvoice;
	}
	
	public void setDueDate(String newDueDate) 
	{
		dueDate = newDueDate;
	}
	
	public void setClientName(String newClientName) 
	{
		clientName = newClientName;
	}
	
	public void setClientSurname(String newClientSurname) 
	{
		clientSurname = newClientSurname;
	}
	
	public void setClientTelephoneNumber(int newClientTelephoneNumber) 
	{
		clientTelephoneNumber = newClientTelephoneNumber;
	}
	
	public void setClientEmailAddress(String newClientEmailAddress) 
	{
		clientEmailAddress = newClientEmailAddress;
	}
	public void setClientPhysicalAddress(String newClientPhysicalAddress) 
	{
		clientPhysicalAddress = newClientPhysicalAddress;
	}
	
	public String getName() 
	{
		return projectNumber;
	}
	
	public String getProjectName() 
	{
		return projectName;
	}
	
	public String getTelephoneNumber() 
	{
		return builingType;
	}
	
	public String getProjectPhysicalAddress() 
	{
		return projectPhysicalAddress;
	}
	public int getErfNumber() 
	{
		return erfNumber;
	}
	
	public double getProjectFees() 
	{
		return projectFees;
	}
	public double getFeesPaidToDate() 
	{
		return feesPaidToDate;
	}
	public double getInvoice() 
	{	invoice = (projectFees - feesPaidToDate);
		return invoice ;
	}
	
	public String getDueDate() 
	{
		return dueDate;
	}
	
	public String getClientName() 
	{
		return clientName;
	}
	
	public String getClientSurname() 
	{
		return clientSurname;
	}
	
	public int getClientTelephoneNumber() 
	{
		return clientTelephoneNumber;
	}
	
	public String getClientEmailAddress() 
	{
		return clientEmailAddress;
	}
	public String getClientPhysicalAddress() 
	{
		return clientPhysicalAddress;
	}
	public architect getArchitect1() 
	{
		return architect1;
	}
	
	public contractor getcontractor1() 
	{
		return contractor1;
	}
	//this method will return a String object that we’ll use outside the class to display the contents of each object.
	public String toString() {
		
		String output = "Project number: " + projectNumber;
		output += "\nProject Name: " + projectName;
		output += "\nBuiling Type: " + builingType;
		output += "\nProject Physical Address: " + projectPhysicalAddress;
		output += "\nErf Number: " + erfNumber;
		output += "\nProject Fees: " + projectFees;
		output += "\nFees Paid To Date: " + feesPaidToDate;
		output += "\nInvoice: " + invoice;
		output += "\nDue Date: " + dueDate;
		output += "\nClient Name: " + clientName;
		output += "\nClient Surname: " + clientSurname;		
		output += "\nClient Telephone Number: " + clientTelephoneNumber;
		output += "\nEmail Address: " + clientEmailAddress;
		output += "\nPhysical Address: " + clientPhysicalAddress;
		output += "\nArchitect Contact Details: " + architect1;
		output += "\nContractor Contact Details: " + contractor1;
		return output;
	}
}
