package ArrayList_EX;

import java.util.ArrayList;
import java.util.Collections;

public class Test10 {

	public static void main(String[] args) {
	
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Het");
		a1.add("Param");
		a1.add("Meet");
		a1.add("Yash");
		
		System.out.println("Before swapping :" + a1);
		Collections.swap(a1,1,3);
		System.out.println("After swapping :" + a1);
		
		
		ArrayList<String> a2 = new ArrayList<String>(a1.subList(1, 3));
		a2.add("aaa");
		System.out.println(a2);
	}

}
