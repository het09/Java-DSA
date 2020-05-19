package TreeMap;

import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {

		TreeMap<String, Integer> t = new TreeMap<String, Integer>();
		t.put("Het", 111);
		t.put("Param", 222);
		t.put("Abhita", 333);
		t.put("Haresh", 444);
		System.out.println(t);
		
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
		t1.put(2, "Het");
		t1.put(4 , "Param");
		t1.put(6 , "Abhita");
		t1.put(8 , "Haresh");
		System.out.println(t1);
	}

}
