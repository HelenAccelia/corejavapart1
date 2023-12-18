package Assignment;
import java.util.*;
class InAmsterdam {
	 //Write Your Code Here..
   public int countAm(String s){
	String str=s.toLowerCase();
	int cnt=0;
	String a[]=str.split(" ");
	for(int i=0;i<=a.length;i++)
	{
	 if(a[i].equals("am"));
	{
	cnt=cnt+1;
	}
	}
	return cnt;
	}
public class Source {
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	InAmsterdam a1=new InAmsterdam();
	String inputString=s.nextLine();
	int count=a1.countAm(inputString);
	System.out.println("count");
	}
	}
	}
		
