package collectionex;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Product>a1=new ArrayList<>();
		Product p=new Product(1,"Mobile",10000);
		a1.add(p);
		a1.add(new Product(2,"Tablet",30000));
		System.out.println("Element in Array List : "+a1);
		Product p2=new Product(2,"camera",5500);
		a1.set(2, p2);
		
		System.out.println("Element in ArrayList using Enhanced for loop");
			for(Product p1:a1) {
				System.out.println("pId:"+p1.getpId());
				System.out.println("pName:"+p1.getpName());
				System.out.println("pPrice:"+p1.getpPrice());
			}
			
			
			System.out.println("Element in Linked List using Iterator :");
			Iterator<Product> iter = a1.iterator();
		    while (iter.hasNext()) {
		    	Product p1=iter.next();
		    	System.out.println(p1);   	
	}
}
}
