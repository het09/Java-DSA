package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		Vector<Product> products = new Vector<Product>();
		products.add(new Product(111,"Soap",100));
		products.add(new Product(222,"Shampoo",500));
		products.add(new Product(333,"Toothpaste",150));
		
		//print data using Enumeration
		Enumeration<Product> e = products.elements();
		while(e.hasMoreElements()) {
			Product p = e.nextElement();
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}
		
		//print data using Iterator
		Iterator<Product> itr = products.iterator();
		while(itr.hasNext()) {
			Product p = itr.next();
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}
		
		//print data using ListIterator
		ListIterator<Product> lstr = products.listIterator();
		while(lstr.hasNext()) {
			Product p = lstr.next();
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}
	}

}
