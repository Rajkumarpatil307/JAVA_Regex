package com.regex;

import java.util.Scanner;
import java.util.regex.*;
public class RegexProblems {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//UC1 As a User need to enter a valid First Name
		System.out.println("Enter the first Name");
		String name=s.next();
		if(Pattern.matches("[A-Z][a-z]+{2,}", name)) {
			System.out.println("The person name is Valid.");
		}else {
			System.out.println("Enter the correct valid name.");
		}
		System.out.println("\n*****************************************");
		//UC2 As a User need to enter a valid Last Name
		System.out.println("Enter the Last Name");
		String Lname=s.next();
		if(Pattern.matches("[A-Z][a-z]+{2,}", Lname)) {
			System.out.println("The person  last name is Valid.");
		}else {
			System.out.println("Enter the correct valid  last name.");
		}
		System.out.println("\n*****************************************");

		//UC3 As a User need to enter a valid email Name
		System.out.println("Enter the email Name");
		String email=s.next();
		if(Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", email)) {
			System.out.println("The person  email name is Valid.");
		}else {
			System.out.println("Enter the correct valid email.");
		}
		System.out.println("\n*****************************************");
		//UC4 As a User need to enter a valid Phone num
		System.out.println("Enter the Phone Number ");
		String phone=s.next();
		if(Pattern.matches("^[+][9][1][0-9]+{10,11}$", phone)) {
			System.out.println("The person  Phone Number is Valid.");
		}else {
			System.out.println("Enter the correct valid Phone Number.");
		}
		System.out.println("\n*****************************************");
		//UC5-9 As a User need to enter a valid email Name
		System.out.println("Enter the PassWord ");
		String password=s.next();
		if(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=[^\\s]*[!@#$%^&*()_+{}:\"<>?`~\\[\\];',./\\\\|-])[^\\s]*[!@#$%^&*()_+{}:\"<>?`~\\[\\];',./\\\\|-][^\\s]*$\r\n", password)) {
			System.out.println("The person  password is Valid.");
		}else {
			System.out.println("Enter the correct valid password.");
		}

	}
}