package com.bridgelabz.UserRegistrationEntry;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface userEntry {
  void UserEntryValidation();
}
class UserName{
    userEntry firstLastName = () -> {
    	Scanner sc = new Scanner(System.in);
	 String userNameRegex = "[A-Z][a-z]{2,}";
		
		// Validation of First Name
		
		System.out.println("Enter First Name of User \nStart with UpperCase ");
		String firstName = sc.next();
		
		// Validation of Last Name
		
		System.out.println("Enter Last Name of User \nStart with UpperCase ");
		String lastName = sc.next();
		
		Pattern pt = Pattern.compile(userNameRegex);
		
		if(firstName.matches(userNameRegex) && lastName.matches(userNameRegex))
		{
			System.out.println("Name is Valid");
			
			System.out.println("UserName = "+firstName+" "+lastName);
		}
		else
		{
			System.out.println("Name is not Valid"); //\nRe-Enter Valid name\n Check the First name or Last name ");
			if(firstName.matches(userNameRegex))
			{
				System.out.println("You Entered the Invalid LastName");
			}
			else
			{
				System.out.println("You Entered the Invalid FirstName");
			}
		}
        sc.close();
    };
}
public class UserRegistration {
	public static void main(String args[]) {
		UserName obj = new UserName();
		obj.firstLastName.UserEntryValidation();	
	}
}
