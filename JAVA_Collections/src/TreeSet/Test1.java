package TreeSet;

import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("Het");
		t.add("Param");
		t.add("Abhita");
		t.add("Haresh");
		System.out.println(t);
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(16);
		t1.add(9);
		t1.add(13);
		t1.add(7);
		System.out.println(t1);
		
		TreeSet t2 = new TreeSet();
		t2.add(10);
		//t2.add("Het");    //java.lang.ClassCastException
		
		TreeSet t3 = new TreeSet();
		t3.add("Het");
		//t3.add(null);       //java.lang.NullPointerException

	}

}
