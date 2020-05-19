package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Product> lh = new LinkedHashMap<Integer, Product>();
		lh.put(1, new Product(111,"pen",10.5));
		lh.put(2, new Product(222,"bottle",100.5));
		lh.put(3, new Product(333,"phone",15000.5));
		lh.put(4, new Product(444,"chair",600.5));

		Set<Entry<Integer, Product>> s = lh.entrySet();
		Iterator<Entry<Integer, Product>> itr = s.iterator();
		while(itr.hasNext()) {
			Entry<Integer, Product> e = itr.next();
			Product p = e.getValue();
			if(p.id == 111) {
				itr.remove();
			}
			if(p.name.equals("phone")) {
				itr.remove();
			}
		}
		
		//print the data
		for(Entry<Integer, Product> e: lh.entrySet()) {
			Product p = e.getValue();
			System.out.println(p.id+" "+p.name+" "+p.cost); 
		}
	}

}
