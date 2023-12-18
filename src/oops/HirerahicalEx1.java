package oops;
class Person {
	  String name;
	  int age;

	  Person(int age, String name) {
	    this.name = name;
	    this.age = age;
	  }
	}

	class Employee extends Person {
	  int emp_id;
	  int emp_salary;

	  Employee(int id, String name, int age, int salary) {
	    super(age, name);
	    emp_id = id;
	    emp_salary = salary;
	  }

	  void printEmployeeDetails() {
	    System.out.println("Employee ID     :  " + emp_id);
	    System.out.println("Employee Name   :  " + name);
	    System.out.println("Employee Age    :  " + age);
	    System.out.println("Employee Salary :  " + emp_salary);
	  }
	}
public class HirerahicalEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101, "Savas Akhtan", 32, 22340);
	    emp.printEmployeeDetails();
	}

}
