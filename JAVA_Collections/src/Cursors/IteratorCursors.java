package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursors {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Het");
		a1.add("Param");
		a1.add("Meet");
		a1.add("Yash");
		
		//Read the data by using iterator : normal version
		Iterator itr = a1.iterator();
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
		}
		
		//Read the data by using iterator : generic version
		Iterator<String> itr1 = a1.iterator();
		while(itr1.hasNext()) {
			String s = itr1.next();
			System.out.println(s);
		}
		
		
	}

}
