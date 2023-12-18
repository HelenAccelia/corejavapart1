package stringex;

public class StringIntern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s=new String("hi");
	String s1=new String("hi");
	System.out.println("String  :"+(s==s1));
	s=s.intern();
	s1=s1.intern();
	System.out.println("String Intern :"+(s==s1));
	}
}
