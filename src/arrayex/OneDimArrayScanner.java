package arrayex;

import java.util.Scanner;

public class OneDimArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Elements:");
		for (int i=0;i>size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("My Array Elements: ");
		  for(int i=0;i<size;i++) {
				 System.out.print(a[i]);
			 }
		 }
		 
	}

