package Vector;

import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,6);
		System.out.println(v.capacity());
		v.add("Het");
		v.add("Param");
		v.add("Meet");
		System.out.println(v);
		System.out.println(v.capacity());
	}
}
