package collectionex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer>l1=new LinkedList<>();
		l1.add(10);
		l1.addFirst(20);
		l1.add(30);
		l1.offerLast(50);
		l1.addLast(40);
		System.out.println("Element in Lined List : "+l1);
		System.out.println("Element in Lined List : "+l1.peekLast());
		System.out.println("Element in Lined List : "+l1);
		System.out.println("Element in pullfirst : "+l1.pollFirst());
		System.out.println("Element in Lined List : "+l1);
		System.out.println("Element in Lined List : "+l1.pollLast());
		System.out.println("Element in Lined List : "+l1);
		System.out.println("Element in Lined List : "+l1.getFirst());
		System.out.println("Element in Lined List : "+l1);
   		System.out.println("Element in peekfirst Linked List : "+l1.peekFirst());
		System.out.println("Element in Lined List : "+l1);
	
		System.out.println("Element in Linked List using Iterator :");
		Iterator<Integer> iter = l1.descendingIterator();
	    while (iter.hasNext()) {
	      int i = iter.next();
	       System.out.println(i);
	       
	       
	       
	    Stack<Integer> s=new Stack<>();
	   	s.push(10);
	   	s.push(12);
	   	s.push(14);
	   	System.out.println("My elements:"+s);
	   	s.pop();
	   	System.out.println("After Pop my elements:"+s);
	   	System.out.println("Top of the elment:"+s.peek());//top of elemnt
	   	System.out.println(s.isEmpty());
	    }
	
	
	}

}
