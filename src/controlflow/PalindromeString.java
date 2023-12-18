package controlflow;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Helen";
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		System.out.println("String Reverse:"+sb);
		if (str.equals(rev)) {
			System.out.println("String palindorme");
		}
		else {
			System.out.println("String not palindorme");
		}
	}

}
