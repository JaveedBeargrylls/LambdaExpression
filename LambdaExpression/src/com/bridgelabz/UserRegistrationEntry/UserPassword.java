package com.bridgelabz.UserRegistrationEntry;
import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface Password {
  void UserEntryValidation();
}
class Userpassword{
    Password password = () -> {
    	Scanner sc = new Scanner(System.in);
		//  Minimum 8 Char
		
		//passwordRegex = "[[A-Za-z0-9!@#$%^&*\\-]+]{8,}";
		
			// Contain Minimum 1 UpperCase. 
		
		// passwordRegex = "[A-Z]{1}[[A-Za-z0-9!@#$%^&*\\-\\_]+]{2,8}";
		
			// Contain atleast 1 Numeric 
		String passwordRegex = "^(?=.*[A-Z])(?=.*[\\d])(?=.*[a-z])(?=.*[@#$%\\-\\+\\_]).{8,}$";
		System.out.println("Enter the Valid password minimum 8 characters : ");
		String password = sc.next();
		Pattern pt = Pattern.compile(passwordRegex);
		if(password.matches(passwordRegex))
		{
			System.out.println("Password is Valid");
		}
		else
		{
			System.out.println("Password is Not Valid");
		}
    };   
}
public class UserPassword { 
	public static void main(String[] args) throws Exception {
		Userpassword key = new Userpassword();
		key.password.UserEntryValidation();	
		}

}
