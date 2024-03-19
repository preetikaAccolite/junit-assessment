package testprac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

//import assessment.LOGIN;

public class login {
	static HashMap<String,String> map=new HashMap<>();
	static Scanner sc=new Scanner(System.in);
	static int a=0,f=0;
	public void Register() {
		System.out.println("enter email:");
		String email=sc.nextLine();
		isValidEmail(email);
		if(email==null) {
			System.out.println("please enter valid email");
		}
		if(isValidEmail(email)) {
			System.out.println("enter password");
			String password=sc.nextLine();
			if(isvalidpasswrd(password))
				System.out.println("Strong password");
			else
				System.out.println("enter a strong password");
			map.put(email, password);
			System.out.println("enter 1 if you want to login");
			login1();
		}
		else {
			System.out.println("invalid email"); 
		}
	}
	public boolean isValidEmail(String email) {
		String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$";
		Pattern pt=Pattern.compile(emailRegex);
		if(pt.matcher(email).matches()){
			System.out.println("Valid");
			return true;
		}
		else {
			System.out.println("Invalid");
		}
		return false;
	}
	public boolean isvalidpasswrd(String password) {
		int n = password.length(); 
        boolean hasLower = false, hasUpper = false, 
                hasDigit = false, specialChar = false; 
        Set<Character> set = new HashSet<Character>( 
            Arrays.asList('!', '@', '#', '$', '%', '^', '&', 
                          '*', '(', ')', '-', '+')); 
        for (char i : password.toCharArray()) 
        { 
            if (Character.isLowerCase(i)) 
                hasLower = true; 
            if (Character.isUpperCase(i)) 
                hasUpper = true; 
            if (Character.isDigit(i)) 
                hasDigit = true; 
            if (set.contains(i)) 
                specialChar = true; 
        } 
        
        // Strength of password 
        if (hasDigit && hasLower && hasUpper && specialChar 
            && (n >= 8)) 
            return true;
        else
        	return false;
	}
	
	public void login1() {
		System.out.println("enter email:");
		String uemail=sc.nextLine();
		System.out.println("enter password:");
		String upassword=sc.nextLine();
		if(isvaliduser(uemail,upassword)) {
			System.out.println("login successfull");
		}
		else {
			System.out.println("login failed");
		}
	}
	public boolean isvaliduser(String email,String password) {
		map.put("Rashi@gmail.com","Rashii@2245");
		map.put("Meenakshi", "Minakshi&566");
		if (map.get(email).equals(password)) {
			return true;
		}
		return false;
	}
	public void forgot_password() {
		System.out.println("enter email:");
		String useremail=sc.nextLine();
		System.out.println("please enter a valid 8 digit password");
		String userpass=sc.nextLine();
		if(map.containsKey(useremail)) {
			map.put(useremail, userpass);
			System.out.println("password changed successfully");
		
		}
		else {
			System.out.println("the user does not exist");
		}
	}
	public static void main(String[] args) {
		login obj=new login();
		System.out.println("select from the below option how do you want to proceed");
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("3.ForgotPassword");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num) {
		case 1:obj.Register();break;
		case 2:obj.login1();break;
		case 3:obj.forgot_password();break;
		default:break;
		}
		sc.close();
	}
}
