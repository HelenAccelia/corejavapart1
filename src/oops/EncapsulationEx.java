package oops;
class Learner{
	private int rollno=23;
	String name="Helen Accelia";
    public int getrollno() {
		return rollno;
	}
	public void setrollno(int rollno) {
	   this.rollno=rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Learner() {
    }
	public Learner(int rollno,String name) {
		super();
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.name=name;
	}
	
}
public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learner l=new Learner();
		l.setName("hellen");
		l.setrollno(23);
		System.out.println("Name: "+l.getName()+ "Rollno: "+l.getrollno());
		Learner l1=new Learner(31,"Hellen");
		System.out.println("Name: "+l1.getName()+ "Rollno: "+l1.getrollno());
		l1.setName("Hellen");
		System.out.println("Name: "+l.getName()+ "Rollno: "+l.getrollno());
	}
	

}
