import java.util.*;

public class PoisedStructuralEngineers 
{
	public static void main(String[] args) 

	{
		
		Scanner scanner = new Scanner(System.in);
		
		//ask the user to enter the architects contact details
		System.out.println("----------------------- ARCHITECT CONTACT DETAILS --------------------------------"); 
		System.out.println("\nPlease enter architect's name: "); 
		String architectName = scanner.nextLine();				  

		System.out.println("Please enter architect's surname: "); 
		String architectSurname = scanner.nextLine();

		System.out.println("Please enter architect's telephone number: ");
		int architectTelephoneNumber = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Please enter architect's email address: ");
		String architectEmailAddress = scanner.nextLine();

		System.out.println("Please enter architect's physical address: ");
		String architectPhysicalAddress = scanner.nextLine();
		
		 //create an object from the class: architect
		 //store information into each instance variable
		architect architect1 = new architect(architectName, architectSurname, architectTelephoneNumber, 
				architectEmailAddress, architectPhysicalAddress);
		
		//call and display the toString method from architect class
		System.out.println(architect1.toString());
		
		//ask the user to enter the contractor's contact details
		System.out.println("\n----------------------- CONTRACTOR CONTACT DETAILS --------------------------------\n");
		System.out.println("Please enter contractor's name: "); 
		String contractorName = scanner.nextLine();				  				  

		System.out.println("Please enter contractor's surname: "); 
		String contractorSurname = scanner.nextLine();

		System.out.println("Please enter contractor's telephone number: "); 
		int contractorTelephoneNumber = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Please enter contractor's email address: "); 
		String contractorEmailAddress = scanner.nextLine();

		System.out.println("Please enter contractor's physical address: ");
		String contractorPhysicalAddress = scanner.nextLine();
		
		 //create an object from the class: contractor
		 //store information into each instance variable
		contractor contractor1 = new contractor(contractorName, contractorSurname, contractorTelephoneNumber, 
				contractorEmailAddress, contractorPhysicalAddress);
		
		//call and display the toString method from contractor class
		System.out.println(contractor1.toString());
		
		//ask the user to enter the project details
		System.out.println("\n----------------------- PROJECT DETAILS --------------------------------\n");
		System.out.println("Please enter project number: "); 
		String projectNumber = scanner.nextLine();

		System.out.println("Please enter project name: "); 
		String projectName = scanner.nextLine();

		System.out.println("Please enter builing type: "); 
		String builingType = scanner.nextLine();

		System.out.println("Please enter project physical address: "); 
		String projectPhysicalAddress = scanner.nextLine();

		System.out.println("Please enter erf number: "); 
		int erfNumber = scanner.nextInt();

		System.out.println("Please enter project fees: "); 
		double projectFees = scanner.nextDouble();

		System.out.println("Please enter fees paid to date: "); 
		double feesPaidToDate = scanner.nextDouble();

		scanner.nextLine();
		System.out.println("Please enter due date(dd/MM/YYYY): "); 
		String dueDate = scanner.nextLine();

		System.out.println("Please enter client's name: "); 
		String clientName = scanner.nextLine();

		System.out.println("Please enter client's surname: "); 
		String clientSurname = scanner.nextLine();

		System.out.println("Please enter client's telephone number: "); 
		int clientTelephoneNumber = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Please enter client's email address: "); 
		String clientEmailAddress = scanner.nextLine();

		System.out.println("Please enter client's physical address: "); 
		String clientPhysicalAddress = scanner.nextLine();

		double invoice = projectFees - feesPaidToDate;
		
		 //create an object from the class: projects
		 //store information into each instance variable
		Projects project1 = new Projects(projectNumber, projectName, builingType, projectPhysicalAddress, erfNumber,projectFees,
				feesPaidToDate, invoice, dueDate, clientName, clientSurname, clientTelephoneNumber, clientEmailAddress, 
				clientPhysicalAddress, architect1, contractor1);
		
		//call and display the toString method from projects class
		System.out.println(project1.toString());

	}

}
