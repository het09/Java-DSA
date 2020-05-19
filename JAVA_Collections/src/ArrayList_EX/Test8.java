package ArrayList_EX;

import java.util.ArrayList;

public class Test8 {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(111,"Het");
		Emp e2 = new Emp(222,"Param");
		Emp e3 = new Emp(333,"Yash");
		Emp e4 = new Emp(444,"Meet");
		
		ArrayList<Emp> a1 =new ArrayList<Emp>();
		a1.add(e1);
		a1.add(e2);
		
		ArrayList<Emp> a2 =new ArrayList<Emp>();
		a2.addAll(a1);
		a2.add(e3);
		a2.add(e4);
		
		/*
		 * System.out.println(a2.contains(e1)); 
		 * System.out.println(a2.containsAll(a1));
		 * a2.remove(e1); 
		 * System.out.println(a2.contains(e1));
		 * System.out.println(a2.containsAll(a1));
		 */
		
		a2.removeAll(a1);  //all a1 obj are removed
		a2.retainAll(a1);    //all a2 obj are removed
		 
		for(Emp e: a2) {
			System.out.println(e.eid+" "+e.ename);
		}
		
		
	}

}
