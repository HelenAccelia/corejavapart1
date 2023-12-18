package reversenumber;

public class ReverseEX {
	void ReverseEXFun() {
	int no=12;
	 int rev = 0;
    while(no!= 0) { 
           int n= no %10; 
           rev = (rev * 10) + n; 
           n = n / 10; 
    } 
    System.out.print("Reverse: "+ rev);
	}
	public static void main(String[] args) {
		ReverseEX r=new ReverseEX();
		r.ReverseEXFun();
		int a=2;
		int b=5;
		System.out.println("power: "+Math.pow(a,b)); 
	}
}
