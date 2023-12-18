package collectionex;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>aList=new ArrayList<>();
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(40);
		aList.add(50);
		System.out.println("Element in the array list are:"+aList);
		System.out.println("Element in the array list are:"+aList.size());
		
		ArrayList <String>a1=new ArrayList<>();
		a1.add("Helen");
		a1.add("stephen");
		a1.add("Raichal");
		a1.add("Appa");
		a1.add("Amma");
		System.out.println("Element in the array list are:"+a1);
	    a1.remove(0);
	    System.out.println("Element in the array list are:"+a1);
	    a1.set(3, "dora");
	    System.out.println("Element in the array list are:"+a1);
	}

}
