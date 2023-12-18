package operatorex;

public class UnaryEx {
	public static void main(String[] args) {
		int a=10;
		int x=a++;
	    System.out.println("Value of X: "+x);
	    int b=100;
		int y=++b;
		System.out.println("Value of Y: "+y);
		int c=100;
		int z=c--;
        System.out.println("Value of Z: "+z);
	    int d=100;
		int p=--d;
		System.out.println("Value of P: "+p);
		int xx=0100;
        System.out.println("Negation:"+(~xx));
}
}
