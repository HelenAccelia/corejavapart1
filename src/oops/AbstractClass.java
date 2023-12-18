package oops;
abstract class Birds{
	abstract void display();
	void type() {
		System.out.println("Birds Types");
		
	}
	static void SeasonalBirds() {
		System.out.println("Seasonal Birds");
	}
}
class Crow extends Birds{
	void display() {
		System.out.println("Crow");
	}
}
class Parrot extends Birds{
	void display() {
		System.out.println("Parrot");
	}
}
 class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds b=new Crow();
		Birds bref=b;
		bref.display();
		b.type();
		Birds.SeasonalBirds();
		b.type();
		Birds b1=new Parrot();
		b1.display();
//		Birds b2 =new Birds();

	}

}
