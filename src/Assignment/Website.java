package Assignment;
class InsufficientBalanceExceptiion extends Exception{
	public InsufficientBalanceExceptiion(String arg) 
	{
		super(msg);
	}
}
class ItemOutOfStockExceptiion extends Exception{
	public ItemOutOfStockExceptiion(String arg) 
	{
		super(msg);
	}
}
class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	public Customer(int id, String name, double walletBalance, String address) {
		super();
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}
}
class Item{
	int id;
	String name;
	double companyName;
	boolean isInstock;
	public Item(int id, String name, double companyName, boolean isInstock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.isInstock = isInstock;
	}	
}
class ShoppingException{
	public String purchaseitem(Item i,Customer c) throws InsufficientBalanceException, ItemOutOfStockException{
		if(!i.isInstock) {
			throw new ItemOutOfStockException("Item is out of stock");
		}
		else if(i.price>c.walletBalance) {
			throw new InsufficientBalanceException("customer wallet balance is not sufficient");
		}
		else {
			return "Order Successful";
		}
	}
}
public class Website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer(927392,"Steve",5000.0,"USA");
		Item i=new Item(27392,"T-Shirt","US polo",800,true);
		Website obj=new Website();
		String out=obj.purchaseItem(i,c);
	}

}
