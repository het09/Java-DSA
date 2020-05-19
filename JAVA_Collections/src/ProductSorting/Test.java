package ProductSorting;

import java.util.Collections;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<Product> l = new LinkedList<Product>();
		l.add(new Product(11, "pen", 10.5));
		l.add(new Product(22, "bottle", 550.5));
		l.add(new Product(33, "bag", 1500.5));
		l.add(new Product(44, "book", 150.5));
		
		Collections.sort(l,new NameComparator());
		
		for(Product p : l) {
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}
		

	}

}
