package basic;
import java.io.File;
public class CheckException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			try {
				Class.forName("basic.Demo");
				//File f=new File("demo123.txt");
				System.out.println("Class found");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Class  not found"+e);
			}
	}

}
