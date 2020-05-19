package TreeMap;

import java.util.TreeMap;

public class Test2 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> t1 = new TreeMap<String, Integer>();
		t1.put("Het", 111);
		TreeMap<String, Integer> t2 = new TreeMap<String, Integer>(t1);
		t2.put("Param", 222);
		System.out.println(t2);
		
		// putAll()
		TreeMap<String, Integer> m1 = new TreeMap<String, Integer>();
		m1.put("aaa", 1);
		m1.put("a", 2);
		
		TreeMap<String, Integer> m2 = new TreeMap<String, Integer>();
		m2.put("bbb", 2);
		m2.put("b", 2);
		
		TreeMap<String, Integer> m3 = new TreeMap<String, Integer>();
		m3.putAll(m1);
		m3.putAll(m2);
		m3.put("ccc", 3);
		
		System.out.println(m3);
	}

}
