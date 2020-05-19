package SetExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test3 {

	public static void main(String[] args) {
		LinkedHashSet<String> h1 = new LinkedHashSet<String>();
		h1.add("Het");
		h1.add("Param");
		HashSet<String> h2 = new HashSet<String>(h1);
		h2.add("aaa");
		System.out.println(h2);
		
		LinkedHashSet<String> h11 = new LinkedHashSet<String>();
		h11.add("Het");
		LinkedHashSet<String> h22 = new LinkedHashSet<String>();
		h22.add("Abhita");
		LinkedHashSet<String> h33 = new LinkedHashSet<String>();
		h33.addAll(h11);
		h33.addAll(h22);
		h33.add("zzz");
		System.out.println(h33);

	}

}
