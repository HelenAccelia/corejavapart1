package stringex;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("helloworld "); 
		System.out.println("Append :"+sb.append("all"));
		
		StringBuilder sb1 = new StringBuilder("helloworld "); 
		System.out.println("Append :"+sb.append("all"));
		System.out.println("reverse :"+sb.reverse());
		System.out.println("insert :"+sb.insert(5,"poor"));
		System.out.println("replace :"+sb.replace(3,9,"welcome"));
		System.out.println("Capacity :"+sb.capacity());
	}

}
