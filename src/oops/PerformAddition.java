package oops;

 public class PerformAddition {
	 static int add(int a, int b){
	     return a + b;
	 }
	 static float add(float a, int b){
	     return a + b;
	 }

	 static double add(double a, double b) {
	     return a + b;
	 }
	 static int add(int a, int b, int c){
	     return a + b +c;
	 }
 }	 
 class MethodOverloadingEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Fuction with both integer parameter:"+PerformAddition.add(10,20));
	     System.out.println("Fuction with both double parameter:"+PerformAddition.add(10.2, 20.3));
	     System.out.println("Fuction with three int parameter:"+PerformAddition.add(10, 20, 30));
	     System.out.println("Fuction with one float and one int parameter:"+PerformAddition.add(11.5f, 10));
	}
}
