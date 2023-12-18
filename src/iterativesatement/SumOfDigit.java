package iterativesatement;

public class SumOfDigit {
	void SumOfDigitFun() {
	int no=1234,d=0,sum=0;
	while(no!=0) {
		d= no % 10;  
		sum = sum + d;  
		no = no/ 10;  
		}  

		//prints the result  
		System.out.println("Sum of Digits: "+sum); 
	}
	public static void main(String[] args) {
		SumOfDigit s=new SumOfDigit();
			s.SumOfDigitFun();
			int a=2;
			int b=5;
			System.out.println("power: "+Math.pow(a,b)); 
		}
	}

