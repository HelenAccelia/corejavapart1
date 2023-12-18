package exceptionex;
class Student{
	int score;
	String name;
	public Student( String name,int score) {
		super();
		this.score = score;
		this.name = name;
	}
}
class Classroom{
	public String registerStudent(Student student) {
		if(!(student.name.matches(".*[A-Z].*"))) {
			return "Block letters needed";
		}
		if(student.score<0 || student.score>=100){
			return "invalid score";
		}
		return "Registered";
	}
	public String studentCard(String card) {
		if(card.matches("\\d+")){
			return "valid card";
		}
		else
		{
			return "invalid card";
		}
	}

}
public class StudentReport {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("H", 60);
		Classroom c=new Classroom();
		System.out.println(c.registerStudent(s));
		System.out.println(c.studentCard("abc"));
	}

}
