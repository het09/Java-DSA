package ArrayList_EX;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Emp(9,"Het"));
		al.add(new Student(7,"Param"));
		
		Student s = (Student)al.get(1);
		System.out.println(s.sid+" "+s.sname);
		
		Object o = al.get(0);
		if(o instanceof Student) {
			Student s1 = (Student)o;
			System.out.println(s1.sid+" "+s1.sname);
		}
		if(o instanceof Emp) {
			Emp e1 = (Emp)o;
			System.out.println(e1.eid+" "+e1.ename);
		}
	}

}
