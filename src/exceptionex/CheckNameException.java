package exceptionex;

import java.util.Scanner;

class MyExceptionEx extends Exception{
public MyExceptionEx(String msg) {
	super(msg);
}
}
public class CheckNameException {
	 public String checkName(String firstName, String lastName) throws MyExceptionEx {
		if (firstName.isEmpty()) {
			throw new MyExceptionEx("firstname is empty"); 
		} 
		else if (lastName.isEmpty()) {
			throw new MyExceptionEx("lastname is empty"); 
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
		CheckNameException obj=new CheckNameException();
		try {
			System.out.println(obj.checkName(firstname, lastname));
		}
		catch(MyExceptionEx e) {
			e.getMessage();
		}
	}
	}
