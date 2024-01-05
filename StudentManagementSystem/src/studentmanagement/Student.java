package studentmanagement;

public class Student {
	private int rollNo;
    private String name;
    private double marks;
    private Subject subject;

    public Student(int roolNo, String name, double marks, Subject subject) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}