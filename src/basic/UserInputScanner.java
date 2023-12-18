package basic;

import java.util.Scanner;

public class UserInputScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the full name");
		String fname=sc.nextLine();
		
		System.out.println("Enter Percentage :");
		float percentage=sc.nextFloat();
		
		System.out.println("Enter my name");
		char ch=sc.next().charAt(0);
		
		System.out.println("Full name: "+fname);	
		System.out.println("Percentage : "+percentage);		
		System.out.println("my name first character:"+ch);
	}
	}
