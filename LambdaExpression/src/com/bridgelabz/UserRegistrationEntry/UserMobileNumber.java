package com.bridgelabz.UserRegistrationEntry;
import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface userMobile {
  void UserEntryValidation();
}
class MobileNumValidation{
    userMobile Mobile = () -> {
    	Scanner sc = new Scanner(System.in);
    	String mobileRegex = "[\\+](0|1|91)?[6-9][0-9]{9}";
		System.out.println("Enter the Valid Mobile Number with Country Code : ");
		String mobile = "+"+sc.next();
		Pattern pt = Pattern.compile(mobileRegex);
		if(mobile.matches(mobileRegex))
		{
			System.out.println("Mobile Number is Valid");
			System.out.println("Mobile Number = "+mobile);
		}
		else
		{
			System.out.println("MobileNumber is Not Valid");
		}
			sc.close();
    };
    }
    
public class UserMobileNumber {
	public static void main(String args[]) {
		MobileNumValidation mobile = new MobileNumValidation();
		mobile.Mobile.UserEntryValidation();
	}
}
