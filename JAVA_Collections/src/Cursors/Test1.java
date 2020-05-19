package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Het");
		al.add("Param");
		al.add("Meet");
		al.add("Yash");
		
		//iterator cursor remove the data
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			if(s.equals("Yash")) {
				itr.remove();
			}
		}
		System.out.println(al);

	}

}
