package ArrayList_EX;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add("Het");
		al.add("a");
		al.add(null);
		al.add(10);
		System.out.println(al);
		System.out.println(al.toString());
	}

}
