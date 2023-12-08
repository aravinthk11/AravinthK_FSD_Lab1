package Lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		String firstName;
		String lastName;
		
		System.out.println("Please enter the First name and Last name");
		
		Scanner sc = new Scanner(System.in);
		firstName = sc.nextLine();
		lastName = sc.nextLine();
		
		System.out.println(firstName+" "+ lastName);
		
		int department;
		String dept ;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		department = sc.nextInt();
		
		switch(department) {
		
		case 1 :
			dept = "tech" ;
		    break;
		    
		case 2 :
			dept = "admin" ;
			break;   
		
		case 3 :
		    dept = "hr" ;
	        break;	
	    
	    case 4 :
			dept = "legal" ;
		    break;
			
		default :
			
			System.out.println("Invalid Input, please enter the correct department code");
			System.exit(0); 
		    break;
	}
			
					
		CredentialServ myobj1 = new CredentialServ();
		
		String emailadd = myobj1.generateemailaddress(firstName, lastName, department);
				
		String password = myobj1.generatepassword();
		
		Employee empObj = new Employee(firstName, lastName, emailadd);
		
		myobj1.showcredentials(firstName, lastName, emailadd, password);
				
	}

}
