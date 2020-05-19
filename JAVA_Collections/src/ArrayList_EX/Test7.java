package ArrayList_EX;

import java.util.ArrayList;

public class Test7 {

	public static void main(String[] args) {
	
		// Approach -1 :constructor : only one collection into another
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		a2.add(100);
		System.out.println(a2);
		
		
		// Approach - 2 : addAll() : to add more than one collection into another
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		b1.add(100);
		
		ArrayList<Integer> b2 = new ArrayList<Integer>();
		b2.add(200);
		
		ArrayList<Integer> b3 = new ArrayList<Integer>();
		b3.add(300);
		
		b3.addAll(b1);
		b3.addAll(b2);
		System.out.println(b3);
		

	}

}
