package arrayex;

import java.util.Scanner;

public class StudentMarkEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,total=0,percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject: ");
		n=sc.nextInt();
		int marks[] =new int[n];
		System.out.println("Enter marks out of 100:");
		for (int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
			total=total+marks[i];
		}
		percentage=total/n;
		System.out.println("Sum:"+total);
		System.out.println("Percentage:"+percentage);
	}

}
