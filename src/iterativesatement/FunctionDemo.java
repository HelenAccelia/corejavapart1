package iterativesatement;

public class FunctionDemo {
	int a=20,b=30;
	void add() {
		System.out.println("Addition:"+(a+b));
	}	
	void addition(int n1,int n2 ) {
		System.out.println("Addition:"+(n1+n2));
	}
	int mul() {
		return a*b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	static String display() {
		return "Hello World";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionDemo demo=new FunctionDemo();
		demo.add();
		demo.addition(3,3);
		System.out.println("Multiplication:"+demo.mul());
		System.out.println("Multiplication:"+demo.mul(5,10));
		System.out.println("Static method:"+display());
	}
	

}
