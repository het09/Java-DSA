package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
		LinkedHashMap<Emp, Student> lh = new LinkedHashMap<Emp, Student>();
		lh.put(new Emp(111,"Het") , new Student(1,"Param"));
		lh.put(new Emp(222,"Yash") , new Student(2,"Meet"));
		
		Set<Emp> s = lh.keySet();
		for(Emp e : s) {
			System.out.println(e.eid+" "+e.ename);
		}
		
		for(Emp ee : lh.keySet()) {
			System.out.println(ee.eid+" "+ee.ename);
		}
		
		//print the values
		for(Student s1 : lh.values()) {
			System.out.println(s1.sid+" "+s1.sname);
		}
		
		Set<Entry<Emp, Student>> ss = lh.entrySet();
		Iterator<Entry<Emp, Student>> itr = ss.iterator();
		while(itr.hasNext()) {
			Entry<Emp, Student> e = itr.next();
			Emp ee = e.getKey();
			System.out.println(ee.eid+" "+ee.ename);
			
			Student stu = e.getValue();
			System.out.println(stu.sid+" "+stu.sname);
		}
	}

}
