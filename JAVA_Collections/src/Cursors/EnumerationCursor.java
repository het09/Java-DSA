package Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("Het");
		v.add("Param");
		v.add("Meet");
		v.add("Yash");
		
		//Read the data by using Enumeration : normal version
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			String s = (String) e.nextElement();
			System.out.println(s);
		}
		
		//Read the data using Enumeration : generic
		Enumeration<String> e1 = v.elements();
		while(e1.hasMoreElements()) {
			String s = (String) e1.nextElement();
			System.out.println(s);
		}

	}

}
