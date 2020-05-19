package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp (111,"Param"));
		al.add(new Emp (222,"Haresh"));
		al.add(new Emp (333,"Het"));
		al.add(new Emp (444,"Abhita"));
		
		//Collections.sort(al,new EidComp());
		
		Collections.sort(al,new EnameComp());
		
		for(Emp e : al) {
			System.out.println(e.eid+" "+e.ename);
		}

	}

}
