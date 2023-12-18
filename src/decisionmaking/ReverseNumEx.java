package decisionmaking;

public class ReverseNumEx {
	public static void main(String[] args) {
	String str = "    Hello Everyone I am fine    ";

	str = str.trim();

//        String[] words = str.split("\\s+");
	String[] words = str.split(" ");

	int wordCount = words.length;
	System.out.println("Number of words: " + wordCount);
	}
}
