import java.util.Scanner;

// class Program
public class Program {
	
	//main method
	// user inputs the project number,project name,type of building,address of project,
	// ERF number,fee charged,amount paid, deadline of the project
	public static void main(String[] args) {
		int option = 0;
		Project objectProject = null;
		Person contractor = null;
		Person customer = null;
		int projectNumber = 0;
		int numberERF = 0;
		double projectFee = 0;
		double amountPaid = 0;
		int telNumberContractor = 0;
		int telNumberCustomer = 0;
		
		while(true) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			try {
		        System.out.println("Select one of the options below:\n"
				+ "1) Create project\n"
				+ "2) Edit existing project\n"
				+ "3) Update contractor details\n"
				+ "4) Update customer details\n"
				+ "5) Finalise project\n"
				+ "6) Exit");
		        String userInput =input.nextLine();
                option = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
            	System.out.println("Invalid choice,please enter a number from above!");
            }
			if(option == 1) {
				// Project input
		        boolean flag1 = false;
		        while(!flag1) {
		        	//make the loop break, if no exception caught
			        flag1 = true;
			        try {
                        System.out.println("Enter the project number: ");
                        String userInput =input.nextLine();
                        projectNumber = Integer.parseInt(userInput);
                    }catch(NumberFormatException e) {
                    	System.out.println("Please enter a number!");
                        //make the loop repeat
                        flag1 = false;
		            }
		        }
		        System.out.println("Enter the project name: ");
		        String projectName = input.nextLine();
		        System.out.println("Enter the type of building eg House,Apartment block,Store etc");
		        String building = input.nextLine();
		        System.out.println("Enter the physical address for the project: ");
		        String projectAddress = input.nextLine();
		        boolean flag2 = false;
		        while(!flag2) {
		        	//make the loop break, if no exception caught
			        flag2 = true;
		            try {
		            	System.out.println("Enter the ERF number: ");
		                String userInput =input.nextLine();
                        numberERF= Integer.parseInt(userInput);
                    }catch(NumberFormatException e) {
                    	System.out.println("Please enter a number!");
                        //make the loop repeat
                        flag2 = false;
                    }
	            }
		        boolean flag3 = false;
		        while(!flag3) {
		        	//make the loop break, if no exception caught
			        flag3 = true;
		            try {
		            	System.out.println("Enter the total fee being charged for the project: ");
		                String userInput =input.nextLine();
                        projectFee= Double.parseDouble(userInput);
                    }catch(NumberFormatException e) {
                    	System.out.println("Please enter amount!");
                        //make the loop repeat
                        flag3 = false;
                    }
	            }
		        boolean flag4 = false;
		        while(!flag4) {
		        	flag4 =true;
		            try {
		            	System.out.println("Enter the total amount paid to date: ");
		                String inputUser =input.nextLine();
                        amountPaid= Double.parseDouble(inputUser);
                    }catch(NumberFormatException e) {
                    	System.out.println("Please enter amount!");
                        //make the loop repeat
                        flag4 = false;
                    }
	            }
		        System.out.println("Enter the deadline for the project: ");
		        String deadline = input.nextLine();
		        
		        //project object created
		        objectProject = new Project(projectNumber,projectName,building,projectAddress,
										    numberERF,projectFee,amountPaid,deadline);
		        System.out.println(objectProject.toString() + "\n");
	        }
			
			if(option == 2) {
				boolean flag5 = false;
		        while(!flag5) {
		        	//make the loop break, if no exception caught
			        flag5 = true;
		            try {
		            	//user can change due date or update amount paid to date
		                System.out.println("Select one of the options:\n"
					                        + "1)Change the due date\n  "
					                        + "2)Change the amount paid to date\n ");
		                String userInput = input.nextLine();
		                int choice = Integer.parseInt(userInput);
		                if (choice == 1 ) {
		                	System.out.println("Enter  the new  deadline");
			                String newDeadline = input.nextLine();
			                objectProject.setDeadline(newDeadline);
			                objectProject.getDeadline();
			                System.out.println(objectProject.toString() + "\n");
			            }else if(choice == 2) {
			            	System.out.println("Enter the new amount paid to date");
			                double newAmountPaid = input.nextDouble();
			                input.nextLine();
			                objectProject.setAmountPaid(newAmountPaid);
			                objectProject.getAmountpaid();
			                System.out.println(objectProject.toString() + "\n");
			            }
		            }catch(NumberFormatException e) {
		            	System.out.println("Invalid choice,please enter a number from above!");
                        //make the loop repeat
                        flag5 = false;
                    }
		        }
		    }
			
			if(option == 3) {
				//contractor input	
		        System.out.println("\nContractor details");
		        //Scanner input = new Scanner(System.in);
		        System.out.println("Enter contractor name: ");
		        String firstNameContractor = input.nextLine();
		        System.out.println("Enter contractor surname: ");
		        String lastNameContractor = input.nextLine();
		        boolean flag6 = false;
		        while(!flag6) {
		        	//make the loop break, if no exception caught
			        flag6 = true;
		            try {
		            	System.out.println("Enter contractor telephone number: ");
		                String userInput = input.nextLine();
		                telNumberContractor = Integer.parseInt(userInput);
		            }catch(NumberFormatException e) {
		            	System.out.println("Please enter a number!");
                        //make the loop repeat
                        flag6 = false;
                    }
	            }
		        System.out.println("Enter contractor email address: ");
		        String emailContractor = input.nextLine();
		        System.out.println("Enter contractor physical address: ");
		        String addressContractor = input.nextLine();
		
		        contractor = new Person(firstNameContractor,lastNameContractor,telNumberContractor,emailContractor,addressContractor);
		        System.out.println(contractor.toString() + "\n");
	        }
			if(option == 4) {
				//customer input
		        System.out.println("\nCustomer details");
                System.out.println("Enter customer name: ");
		        String firstNameCustomer = input.nextLine();
		        System.out.println("Enter customer surname: ");
		        String lastNameCustomer = input.nextLine();
		        boolean flag7 = false;
		        while(!flag7) {
		        	//make the loop break, if no exception caught
			        flag7 = true;
		            try {
		            	System.out.println("Enter customer telephone number: ");
		                String userInput = input.nextLine();
		                telNumberCustomer = Integer.parseInt(userInput);
		            }catch(NumberFormatException e) {
		            	System.out.println("Please enter a number!");
                        //make the loop repeat
                        flag7 = false;
                    }
	            }
		        System.out.println("Enter customer email address: ");
		        String emailCustomer = input.nextLine();
		        System.out.println("Enter customer physical address: ");
		        String addressCustomer = input.nextLine();
		
		        customer = new Person(firstNameCustomer,lastNameCustomer,telNumberCustomer,emailCustomer,addressCustomer);
		        System.out.println(customer.toString() + "\n");
	        }
			if(option == 5) {
				//creates an invoice
			    //calculates amount to be paid
			    //if customer has paid in full invoice is not generated
			    double amountToPay;
			    amountToPay = projectFee - amountPaid;
			    if(amountToPay != 0) {
			    	System.out.println("Invoice\n");
				    System.out.println(customer.toString());
				    System.out.println("Amount to pay: " + amountToPay + "\n");	
			    }
			    //completion date is entered
			    System.out.println("Enter the completion date");
			    String completionDate = input.nextLine();
			    System.out.println("Project number " + projectNumber + ": Finalised");
			    System.out.println("Date completed: " + completionDate);
            }
			if(option == 6) {
				System.out.println("Goodbye!!");
		        break;
		    }
			
		}
	}
}


		
