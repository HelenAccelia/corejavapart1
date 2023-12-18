package oops;
class One {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
 
class Two extends One {
    public void print_for() { System.out.println("for"); }
}
 
public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two g = new Two();
        g.print_geek();
        g.print_for();
        g.print_geek();
	}

}
