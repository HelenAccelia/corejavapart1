package exceptionex;
class ExceptionMovie extends Exception{
	public ExceptionMovie(String msg) {
		super(msg);
	}
}
public class MovieExceptions {
	String invalidAge(int age) throws ExceptionMovie {
		if(age<18) {
			throw new ExceptionMovie("Age is smaller than 18");
		}
		else {
			return "Valid ";
		}
	}
	public static void main(String[] args) {
		MovieExceptions m=new MovieExceptions();
		try {
			System.out.println(m.invalidAge(-22));
		} catch (ExceptionMovie e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}

