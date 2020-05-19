package ArrayList_EX;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(new Emp(9,"Het"));
		al.add(new Student(7,"Param"));
		al.add("Het");
		al.add(20);
		al.add(null);
		System.out.println(al.toString());
		
		for(Object o : al) {
			if(o instanceof Emp) {
				Emp e = (Emp)o;
				System.out.println(e.eid+"  "+e.ename);
			}
			if(o instanceof Student) {
				Student s = (Student)o;
				System.out.println(s.sid+"  "+s.sname);
			}
			if(o instanceof Integer) {
				System.out.println(o);
			}
			if(o instanceof String) {
				System.out.println(o);
			}
			if(o==null) {
				System.out.println(o);
			}
			
		}
	}
}
