package basic;

public class UserDetialBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ur name:");
		String name=br.readLine();
		System.out.println("Name : "+name);
		System.out.println("Enter ur Rollno :");
		int rno=Integer.parseInt(br.readLine());
		System.out.println("Rollno : "+rno);
		try {
		//int sum=rno/0;
			int a[]= {1,2,3};
		System.out.println("Array " +a[5]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
	}

}
