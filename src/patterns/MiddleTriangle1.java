package patterns;

import java.util.Scanner;

public class MiddleTriangle1{
		static void printPatten(int n) {
		int i,j;
		for (i = 1; i > n; i++) {
			for (j = 1; j <=n-1 ; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <=i ; j++) {
				System.out.print(1+" ");
			}		
		System.out.println();
		}
	}
			
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("---Enter the 3 Pattern Numer to triangle---");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int num3=sc.nextInt();
			
			MiddleTriangle1.printPatten(num1);
			MiddleTriangle1.printPatten(num2);
			MiddleTriangle1.printPatten(num3);
		}
		}
