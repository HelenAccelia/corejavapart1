package arrayex;

public class OneDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num=new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		int a[]= {1,2,3};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		String str[]= {"Acci","Bavi","Hellen"};
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]+" ");
		}
		for(String str1:str) {
			System.out.print(str1);
	}
 }
}
