package Assignment;
class Travel{
	int a=5,u=3,k=1000,h=3600;
	int t;
	public Travel(int t) {
		this.t=t;
	}
	public int cal() {
		int total=(u*k/h)*t+((a*t*t)/2);
		return total;
	}
}
public class DistanceTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Travel t=new Travel(10);
		System.out.println(t.cal());
		Travel t1=new Travel(8);
		System.out.println(t1.cal());
		
	}

}
