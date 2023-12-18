package oops;
class Animals {
    void food() {
    	System.out.println("Collecting"); }
}
 
class dog extends Animals {
    void bones() {
    	System.out.println("Eating"); 
    	}
}
 
class cat extends Animals {
    void milk() { 
    	System.out.println("Drinking"); 
    	}
}
  class HierarchicalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog obj_d = new dog();
        obj_d.food();
        obj_d.bones();
 
        cat obj_c = new cat();
        obj_c.food();
        obj_c.milk();

	}

}
