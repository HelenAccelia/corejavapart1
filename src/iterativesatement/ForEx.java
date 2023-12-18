package iterativesatement;

public class ForEx {

	public static void main(String[] args) {
		for(int i=1;i<1;i++) {
			System.out.println(i);
		}
		System.out.println("Even no:");
				for(int i = 1; i<=5; i++) {
					if(i%2!=0) {
						System.out.println(i +" ");
					}
				}
				System.out.println();
				System.out.println("odd no using while:");
				int no=2;
				while(no<=5) {
					if(no%2==0)
					System.out.println(no+" ");
				}
				no++;
	}
	

}
