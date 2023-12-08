package Lab1;

import java.util.Random;

public class CredentialServ {
	
	public String generateemailaddress(String fName, String lName, int department)
	{
	
	StringBuilder email = new StringBuilder() ;
	
	email.append(fName.toLowerCase());
	email.append(lName.toLowerCase());
	email.append("@");
	email.append(department);
	email.append("abc.com");
	
	return email.toString();
}

	public String generatepassword()
	{
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";		
		String numbers = "0123456789";
		String specialCharacters = "~!@#$%^&*()-=+<>?'][}{";
		
		String characters = capitalLetters + smallLetters + numbers + specialCharacters;
		
		int len = characters.length();
		
		Random objR = new Random();
		
		int i, val;
		char c;
		StringBuilder pass = new StringBuilder();
		
		for (i = 1; i <= 8; i++)
		{
			
		    val = objR.nextInt(len);
		    c = characters.charAt(val);
		    pass.append(c);
		  
		}
			
		    return pass.toString();
		
	}
	
	  public void showcredentials (String fName, String lName, String email, String pass)
	
	  {
		  System.out.println("Dear "+ fName +" your generated credentials are as follows:");
		  
		  System.out.println("Email     ---> "+ email);
		  
		  System.out.println("Password  ---> "+ pass);
		  
	  }
	  
	
	
	
}

