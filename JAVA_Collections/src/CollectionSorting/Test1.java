package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		
		
		// Case-1
		ArrayList<String> al = new ArrayList<String>();
		al.add("Param");
		al.add("Het");
		al.add("Abhita");
		al.add("Haresh");
		System.out.println("Before Sorting: "+al);
		Collections.sort(al);
		System.out.println("After Sorting: "+al);
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(3);
		l.add(20);
		l.add(5);
		System.out.println("Before Sorting: "+l);
		Collections.sort(l);
		System.out.println("After Sorting: "+l);
		

		// Case -2 : ClassCastException
		ArrayList a2 = new ArrayList();
		a2.add(10);
		a2.add("Het");
		//Collections.sort(a2);    java.lang.ClassCastException
		
		
		// Case -3 : NullPointRxception
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(null);
		//Collections.sort(v);    java.lang.NullPointerException
		
	}

}
