package Comparator;

import java.util.Comparator;

public class EidComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;
		if(e1.eid==e2.eid)
			return 0;
		else if(e1.eid>e2.eid)
			return 1;
		else
			return -1;
	}
	
	
}
