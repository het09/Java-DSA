package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Test4 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>(new MyComp());
		t1.put(1, "Het");
		t1.put(10, "Param");
		t1.put(2, "Yash");
		t1.put(20, "Meet");
		System.out.println(t1);
	}

}

class MyComp implements Comparator<Integer>
{
	@Override
	public int compare(Integer i1, Integer i2) {
		return -i1.compareTo(i2);
	}
	
}