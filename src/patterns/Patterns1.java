package patterns;

public class Patterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		System.out.println("-----Number types----");
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
