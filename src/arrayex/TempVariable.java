package arrayex;

public class TempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,0,7,5,8};
		 int temp = 0;
		System.out.println("My sorted Array:");
		  for (int i = 0; i < a.length; i++) {
		      for (int j = i + 1; j < a.length; j++) {
		       
		        if (a[i] > a[j]) {
		          temp = a[i];
		          a[i] = a[j];
		          a[j] = temp;
		        }
		      }      
		      System.out.println(a[i]);
	
		  }
		}
	}

