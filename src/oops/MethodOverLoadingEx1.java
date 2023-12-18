package oops;

public class MethodOverLoadingEx1 {
	void shape(int l,int b) {
		System.out.println("Rectangle area:"+(l*b));
	}
	void shape(int b ,float h) {
		System.out.println("Triangle area:"+(0.5*b*h));
	}
	void shape(float b ,int h) {
		System.out.println("Circle area:"+(0.5*b*h));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingEx1 m=new MethodOverLoadingEx1();
		m.shape(10,20);
		m.shape(2, 0.5f);
		m.shape(0.5f, 20);
	}

}
