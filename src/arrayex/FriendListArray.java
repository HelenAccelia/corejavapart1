package arrayex;

import java.util.Scanner;

public class FriendListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Friend list: ");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter my friend names:");
		for (int i=0;i>size;i++) {
			a[i]=sc.nextInt();
		}
		  String str[]= {"Acci","Bavi","Hellen"};
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]+" ");
			}
		
	}
}

