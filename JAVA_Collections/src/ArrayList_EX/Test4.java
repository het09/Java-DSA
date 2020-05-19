package ArrayList_EX;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		//arrays are type safe
		int[] a = {10,20,20};
		for(int aa : a) {
			System.out.println(aa);
		}
		
		//collections are not type safe
		ArrayList al = new ArrayList();
		al.add(new Emp(7,"Het"));
		al.add(new Student(9,"Param"));
		
		for(Object o : al) {
			if(o instanceof Emp) {
				Emp e = (Emp)o;
				System.out.println(e.eid+" "+e.ename);
			}
			if(o instanceof Student) {
				Student s = (Student)o;
				System.out.println(s.sid+" "+s.sname);
			}
		}
		
		Object oo = al.get(1);
		if(oo instanceof Emp) {
			Emp e = (Emp)oo;
			System.out.println(e.eid+" "+e.ename);
		}
		if(oo instanceof Student) {
			Student s = (Student)oo;
			System.out.println(s.sid+" "+s.sname);
		}
		
		//provide the type safety to the collection using generics
		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.add(new Emp(777,"HET"));
		a2.add(new Emp(999,"Godhani"));
		for(Emp e : a2) {
			System.out.println(e.eid+" "+e.ename);
		}
		
		Emp e = a2.get(1);
		System.out.println(e.eid+" "+e.ename);
	}

}
