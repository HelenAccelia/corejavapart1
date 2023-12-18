package exceptionhandling;

import java.util.Scanner;

class MyException extends Exception{
public MyException(String msg) {
	super(msg);
}
}
public class Question1 {
	String checkName(String firstName, String lastName) throws MyException {
		if (firstName.isEmpty()) {
			throw new MyException("firstname is empty"); 
		} 
		else if (lastName.isEmpty()) {
			throw new MyException("lastname is empty"); 
		} 
		else {
			return firstName +" " +lastName;
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the first name");
		String firstname=sc.nextLine();
		System.out.println("Enter the second name");
		String lastname=sc.nextLine();
		Question1 obj = new Question1();
		try {
			String FullName=obj.checkName(firstname, lastname);
			System.out.println("Full Name:"+FullName);
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
}
}
