package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test3 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Het");
		al.add("Param");
		al.add("Meet");
		
		ListIterator<String> lstr = al.listIterator();
		lstr.add("Yash");
		
		while(lstr.hasNext()) {
			String s = lstr.next();
			if(s.equals("Meet"))
				lstr.remove();
			if(s.equals("Param"))
				lstr.set("Param Godhani");
		}
		
		System.out.println(al);
	}

}
