package arrayex;

import java.util.Scanner;
public class AdditionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size=sc.nextInt();
		int a[][]=new int[size][size];
		int b[][]=new int[size][size];
		int c[][]=new int[size][size];;
		//String names[];
		System.out.println("Enter Elements for A matrix : ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Enter Elements for B matrix : ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				b[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("My Array Elements : ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
	}
	}
}
