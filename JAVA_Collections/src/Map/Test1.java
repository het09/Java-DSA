package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(111,"Param");
		h.put(2,"Het");
		h.put(333,"Abhita");
		h.put(444,"Haresh");

		System.out.println(h);
		
		Set<Integer> s = h.keySet();
		System.out.println(s);
		
		Collection<String> c = h.values();
		System.out.println(c);
		
		Set<Entry<Integer, String>> s1 = h.entrySet();
		for(Entry<Integer, String> e : s1) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
