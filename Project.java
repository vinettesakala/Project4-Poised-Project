//class Project
public class Project {
	int projectNumber;
	String projectName;
	String building;
	String projectAddress;
	int numberERF;
	double projectFee;
	double amountPaid;
	String deadline;
	
	//Constructor
	public Project(int projectNumber, String projectName, String building, String projectAddress,
			       int numberERF, double projectFee, double amountPaid, String deadline) {
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.building = building;
		this.projectAddress = projectAddress;
		this.numberERF = numberERF;
		this.projectFee = projectFee;
		this.amountPaid = amountPaid;
		this.deadline = deadline;
		
	}
	
	//Getters
	public String getDeadline() {
		return deadline;
	}
	public double getAmountpaid() {
		return amountPaid;
	}
	
	//Setters
	public void setDeadline(String newDeadline) {
		this.deadline = newDeadline;
	}
	public void setAmountPaid(double newAmountPaid) {
		this.amountPaid = newAmountPaid;
	}
	
	//toString method
	public String toString() {
		String output = "Project Number: " + projectNumber;
		output += "\nProject Name: " + projectName;
		output += "\nType of building: " + building;
		output += "\nProject address: " + projectAddress;
		output += "\nERF number: " + numberERF;
		output += "\nFee charged: " + "R" + projectFee;
		output += "\nAmount paid to date: " + "R" + amountPaid;
		output += "\nProject deadline: " + deadline;
		
		return output;
		
		
	}

}
