package ArrayList_EX;

import java.util.ArrayList;
import java.util.Arrays;

public class Test9 {

	public static void main(String[] args) {
	
		//conversion of arrays to collection
		String[] s = {"aaa","bbb","ccc"};
		
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(s));
		a1.add("Het");
		a1.add("Param");
		System.out.println(a1);
		
		
		//conversion of generic collection to arrays
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Het");
		a2.add("Param");
		
		String[] s1 = new String[a2.size()];
		a2.toArray(s1);
		for(String ss : s1)
		{
			System.out.println(ss);
		}
		
		//conversion of normal collection to arrays
		ArrayList a3 = new ArrayList();
		a3.add("Het");
		a3.add(20);
		Object[] o = a3.toArray();
		for(Object oo : o) {
			System.out.println(oo);
		}
	}

}
