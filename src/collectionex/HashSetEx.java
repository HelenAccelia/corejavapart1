package collectionex;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> even = new HashSet<>();
		even.add(null);
		even.add(2);
		even.add(4);
		even.add(2);
		even.add(8);
		even.add(null);
        System.out.println("HashSet1: " + even);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("HashSet2: " + numbers);
//
//        // Union of two set
//        numbers.addAll(even);
//        System.out.println("Union is: " + numbers);
//        numbers.retainAll(even);
//        System.out.println("Intersection is: " + numbers);
        numbers.removeAll(even);
        System.out.println("Diffrence : " + numbers);

	}

}
