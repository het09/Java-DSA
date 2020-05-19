package TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(int i = 1; i <= 10; i++) {
			t.add(i);
		}
		System.out.println(t);
		
		SortedSet<Integer> s1 = t.subSet(3,7);
		TreeSet<Integer> t1 = new TreeSet<Integer>(s1);
		System.out.println(t1);
		
		SortedSet<Integer> s2 = t.tailSet(4);
		TreeSet<Integer> t2 = new TreeSet<Integer>(s2);
		System.out.println(t2);
		
		SortedSet<Integer> s3 = t.headSet(6);
		TreeSet<Integer> t3 = new TreeSet<Integer>(s3);
		System.out.println(t3);

	}

}
