package oops;
abstract class Pens{
	Pens() {
		System.out.println("Astract class");	
	}
	void bluepen() {
		System.out.println("use to write words in blue colour");
	}
}
class redpen extends Pens{
	void display() {
		System.out.println("Crow");
	}
}
public class AstractClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
