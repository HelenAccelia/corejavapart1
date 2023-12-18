package exceptionex;
public class MarksheetEx {
    public void displayMarks(int marks) {
        try {
            if (marks > 0 && marks < 100) {
                System.out.println("marks is: " + marks);
            } else {
                throw new Exception("marks is less than or equal to 0");
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("I'm always executed");
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			MarksheetEx m = new MarksheetEx();
			try
			{
			m.displayMarks(100);
			}
			catch (Exception e)
			{
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
			}
			}
	}
	}
