package Inheritance;
class Vehicle1{
	//When parent class method and child class method name and variablename is same
	int speed =100;
	void display() {
		System.out.println("Parent class");
		System.out.println("Speed of vehicle:"+speed);
	}
	void vType() {
		System.out.println("Four wheeler");
	}
}
class Car extends Vehicle1{
	int speed=120;
	void display() {
		vType();
		super.display();
		System.out.println("Speed of vehicle: "+super.speed);
		System.out.println("Speed of car: "+speed);

	}

}
public class SuperAsVariable {
		public static void main(String[] args) {
			Car c=new Car();
			c.display();
}
}
