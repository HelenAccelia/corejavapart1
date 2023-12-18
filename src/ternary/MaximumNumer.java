package ternary;

public class MaximumNumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable Declaration
        int a = 10, b = 25, c = 15, max;
 
        // Maximum among a, b, c
        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
 
        // Print the largest number
        System.out.println("Maximum number among " + a
                           + ", " + b + " and " + c + " is "
                           + max);
	}

}
