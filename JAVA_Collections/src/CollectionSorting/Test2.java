package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111, "Het"));
		al.add(new Emp(444, "Param"));
		al.add(new Emp(222, "Yash"));
		al.add(new Emp(333, "Meet"));
		
		Collections.sort(al);
		
		for(Emp e :al) {
			System.out.println(e.eid+" "+e.ename);
		}
	}
}
