package arrayex;

public class DeepCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] []= {{0,1},{2,3}};
		int cloneArray[] [] = intArray.clone();
		System.out.println(intArray[1][0] == cloneArray[1][0]);
		 for (int i = 0; i < cloneArray.length; i++) { 
			 for(int j = 0;j < cloneArray.length;j++) {
				 
		     System.out.print(cloneArray[i][j]+" ");
		}
			
		 }
	}
	
}
