package oops;

public class MethodOverRidding {
	class Parent1{
//		final void display() {
//			System.out.println("PAren class final method");
//		}
	}
	public class FinalEx extends Parent1{//we declare any class final we can not extend
		final int a=10;//we can not change value
			void display() {//we can not override final method
			
			}
			
		public static void main(String[] args) {
			FinalEx f=new FinalEx();
			f.a  = 15;

		}

	}

}
