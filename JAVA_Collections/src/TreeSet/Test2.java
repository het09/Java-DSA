package TreeSet;
import java.util.Comparator;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new MyComp());
		t.add("Het");
		t.add("Param");
		t.add("Abhita");
		t.add("Haresh");
		System.out.println(t);

		TreeSet<Integer> t1 = new TreeSet<Integer>(new MyComp1());
		t1.add(10);
		t1.add(3);
		t1.add(9);
		t1.add(2);
		System.out.println(t1);
	}

}

class MyComp implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
	
}

class MyComp1 implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2) {
		return -i1.compareTo(i2);
	}
	
}
