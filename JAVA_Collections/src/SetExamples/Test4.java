package SetExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		s.add("Param");
		s.add("Het");
		System.out.println(s);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("HHH");
		al.add("PPP");
		al.add("AAA");
		
		HashSet<String> h = new HashSet<String>(al);
		System.out.println(h);
	}

}
