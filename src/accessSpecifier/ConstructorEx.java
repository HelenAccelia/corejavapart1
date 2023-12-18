package accessSpecifier;
class Student{
	int eno=2;
	String name="Hellen";
	Student(){
		eno=1;
		name="Hellen";
		System.out.println("Default Constructor");
		System.out.println("Eno:"+eno+" Name:"+name);
	}
	Student(int eno,String nm){
		this.eno=eno;
		name=nm;
		System.out.println("Parameterized Constructor");
		System.out.println("Eno:"+this.eno+" Name:"+name);
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println("*************************");
		Student s1=new Student(3,"acci");
	}

}
