package SetExamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test2 {

	public static void main(String[] args) {

		LinkedHashSet<Emp> h = new LinkedHashSet<Emp>();
		h.add(new Emp(111,"Het"));
		h.add(new Emp(222,"Param"));
		h.add(new Emp(333,"Haresh"));
		h.add(new Emp(444,"Abhita"));
		
		Iterator<Emp> itr = h.iterator();
		while(itr.hasNext()) {
			Emp e = itr.next();
			if(e.eid==111)
				itr.remove();
			if(e.ename.equals("Haresh"))
				itr.remove();
		}
		
		for(Emp e : h) {
			System.out.println(e.eid+" "+e.ename);
		}
		
	}

}
