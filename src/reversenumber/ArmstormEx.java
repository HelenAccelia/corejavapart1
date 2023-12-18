package reversenumber;

public class ArmstormEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 121,  ono, rem, sum = 0;

        ono = no;

        while ( ono != 0)
        {
        	rem = ono % 10;
        	System.out.println("rem :"+rem);
            sum += Math.pow(rem, 3);
            ono/= 10;
        }
        System.out.println("Sum :"+sum);

        if(sum ==no)
            System.out.println(no + " is an Armstrong number.");
        else
            System.out.println(no + " is not an Armstrong number.");
    }

	}

