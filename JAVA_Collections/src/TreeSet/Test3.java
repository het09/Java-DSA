package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {

		TreeSet<Product> t1 = new TreeSet<Product>(new MyComp2());
		t1.add(new Product(111,"chair",1000.5));
		t1.add(new Product(222,"pen",60.5));
		t1.add(new Product(333,"bottle",155.5));
		t1.add(new Product(444,"phone",10000.5));
		
		for(Product p : t1) {
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}	
	}
}

class MyComp2 implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		return -p1.name.compareTo(p2.name);
	}
	
}