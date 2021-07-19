package com.bridgelabz.UserRegistrationEntry;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface userEmail {
  void UserEntryValidation();
}
class UserEmail{
    userEmail Email = () -> {
    	Scanner sc = new Scanner(System.in);
    	String emailRegex = "^[a-zA-Z0-9-]+[\\.[a-zA-Z0-9]]*@[a-z]{1,7}[\\.[a-z]]*";
		
		//Email id
		
		System.out.println("Enter the valid Email id : ");
		String email = sc.next();
		
		Pattern pt = Pattern.compile(emailRegex);
		
		// validation
		
		if(email.matches(emailRegex))
		{
			System.out.println("Email is Valid");
			System.out.println("Email = "+email);
		}
		else
		{
			System.out.println("Email is Not Valid");
		}
		sc.close();
    };
}
public class UserMail {
	public static void main(String args[]) {
		UserEmail name = new UserEmail();
		name.Email.UserEntryValidation();
	}
}
