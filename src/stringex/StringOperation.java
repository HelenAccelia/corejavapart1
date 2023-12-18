package stringex;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1=new String("everyone");
		System.out.println("Concat : "+s.concat(s1));	
		System.out.println("Length : "+s1.length());	
		System.out.println("Uppercase : "+s1.toUpperCase());	
		System.out.println("Equals : "+s1.equals(s1));
		System.out.println("EqualIgnorecase : "+s.equalsIgnoreCase(s1)); 
		System.out.println("Char at : "+s.charAt(2));	
		System.out.println("Compare : "+s.compareTo(s1));
		System.out.println("Compare ignore case : "+s.compareToIgnoreCase(s1));
		System.out.println("Last Index of : "+s.lastIndexOf('1'));	
		System.out.println("String : "+s);
		System.out.println("Replace : "+s.replace('e','o'));		
		System.out.println("Contains : "+s1.contains(s1));	
		System.out.println("Ends with : "+s.endsWith("123"));	
		System.out.println("substring : "+s.substring(2, 5));
		System.out.println("IsEmpty : "+s.isEmpty());
		System.out.println("IsBlank() : "+s.isBlank());
		System.out.println("InTern : "+s.intern());
		System.out.println("Split : "+s.split(s));
		System.out.println("Join() : "+s.join(s));
		String str1 = "Java123is456fun";
		String regex = "\\d+";
		System.out.println(str1.replaceAll(regex, " ** "));
		String str2 = "";
		String s3 = "  ";
		System.out.println("Is Empty: " + str2.isEmpty());
		System.out.println("Is Blank : " + s3.isBlank());
		String strr = "Java Coding";

		char[] ch;
		//convert string into character array
		ch = strr.toCharArray();
		System.out.println(ch);
		
		
	

	}

}
