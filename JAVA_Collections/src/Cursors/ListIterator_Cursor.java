package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Cursor {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Het");
		al.add("Param");
		al.add("Meet");
		
		//ListIterator cursor : with normal version : print the data forward & backward direction
		ListIterator lstr1 = al.listIterator();
		while(lstr1.hasNext()) {
			String s = (String)lstr1.next();
			System.out.println(s);
		}
		
		while(lstr1.hasPrevious()) {
			String s = (String)lstr1.previous();
			System.out.println(s);
		}
		
		//ListIterator cursor : with generic version :print the data forward & backward direction
		ListIterator<String> lstr2 = al.listIterator();
		while(lstr2.hasNext()) {
			String s = (String)lstr2.next();
			System.out.println(s);
		}
		
		while(lstr2.hasPrevious()) {
			String s = (String)lstr2.previous();
			System.out.println(s);
		}
				
	}

}
