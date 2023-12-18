package reversenumber;

public class PalindromeNubmer {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		 int no=12;
		 int rev = 0;
		 int temp=no;
	     while(no!= 0) { 
	            int n= no %10; 
	            rev = (rev * 10) + n; 
                no /= 10; 
	    }
	     System.out.print(no); 
	     System.out.print("Reverse: "+ rev); 
	     
	     if (rev==temp) {
				System.out.println("palindorme");
			}
			else {
				System.out.println("not palindorme");			
				}
	}

}
