package TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
		t1.put(1, "Het");
		t1.put(20, "p");
		t1.put(40, "param");
		t1.put(10, "h");
		t1.put(2, "meet");
		t1.put(30, "yash");
		System.out.println(t1);
		
		SortedMap<Integer, String> sm1 = t1.subMap(2, 30);
		TreeMap<Integer, String> t2 = new TreeMap<Integer, String>(sm1);
		System.out.println(t2);

		SortedMap<Integer, String> sm2 = t1.tailMap(10);
		TreeMap<Integer, String> t3 = new TreeMap<Integer, String>(sm2);
		System.out.println(t3);
		
		SortedMap<Integer, String> sm3 = t1.headMap(10);
		TreeMap<Integer, String> t4 = new TreeMap<Integer, String>(sm3);
		System.out.println(t4);
	}

}
