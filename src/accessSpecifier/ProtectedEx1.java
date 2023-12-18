package accessSpecifier;
import accessSpecifier.Vehicle1;
 class Vehicle1{
	protected int speed;;
	protected Vehicle1(int s) {
		speed=s;
	}
	
    // protected method
    protected void display() {
        System.out.println("Vehicle class"+speed);
    }
}
class Bike extends Vehicle1{
	String nm;
	protected Bike(int s,String name) {
		super(s);
		nm=name;
		// TODO Auto-generated constructor stub
	}
	void dis() {
		display();
		System.out.println( " name: "+nm);
	}
	
}
class Scooty extends Vehicle1{
	String nm;
	protected Scooty(int t,String name) {
		super(t);
		nm=name;
		// TODO Auto-generated constructor stub
	}
	void dis() {
		display();
		System.out.println( " name: "+nm);
	}
	
}
class XL extends Vehicle1{
	String nm;
	protected XL(int t1,String name) {
		super(t1);
		nm=name;
		// TODO Auto-generated constructor stub
	}
	void dis() {
		display();
		System.out.println( " name: "+nm);
	}
	
}
public class ProtectedEx1 {

	public static void main(String[] args) {
		Bike b=new Bike(100,"Honda");
		b.dis();
		Scooty a=new Scooty(190,"Pep");
		a.dis();
		XL a1=new XL(500,"Hyundai");
		a1.dis();
//		Vehicle1 v=new Vehicle1(100);//we can not access protected constructor in another package non sub class

	}

}

