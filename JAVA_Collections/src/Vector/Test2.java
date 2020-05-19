package Vector;

import java.util.Iterator;
import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 1 ; i<=30;i++) {
			v.add(i);
		}
		System.out.println(v);
		
		// remove odd elements using Iterator
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				itr.remove();
			}
		}
		System.out.println(v);
	}

}
