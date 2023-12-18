package decisionmaking;

public class ReverseStrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="Helen";
		String rev=" ";
		for(int i=n.length()-1;i>=0;i--) {
			rev=rev+n.charAt(i);
		}
		System.out.println(rev);
	}
}
