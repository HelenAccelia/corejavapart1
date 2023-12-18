package accessSpecifier;
class PrivateEx1{
	private int a=2;
	String name="Helen Accelia";
	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	void displayA() {
		System.out.println("A:"+a);
	}
}
public class PrivateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateEx1 ex=new PrivateEx1();
		System.out.println(ex.name);
		ex.displayA();
		ex.setNum(15);
		System.out.println("Get Number:"+ex.getNum());
	}

}
