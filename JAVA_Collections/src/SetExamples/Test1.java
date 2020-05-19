package SetExamples;

import java.util.HashSet;

public class Test1 {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();
		h.add("Param");
		h.add("Het");
		h.add("Abhita");
		h.add("Het");
		System.out.println(h);
		
		HashSet<String> h1 = new HashSet<String>();
		System.out.println(h1.add("Param"));
		System.out.println(h1.add("Param"));
		System.out.println(h1);
	}

}
