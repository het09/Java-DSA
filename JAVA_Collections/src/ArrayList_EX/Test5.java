package ArrayList_EX;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(10.5);
		al.add("Het");
		al.add("a");
		al.add(null);
		al.add(10);
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(3, "hhh");
		System.out.println(al);
		
		al.remove(2);
		al.remove("Het");
		System.out.println(al);
		
		al.set(1, "qqq");
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());
		
		ArrayList a2 = new ArrayList();
		a2.add(10);
		a2.remove(10); //java.lang.IndexOutOfBoundsException
		System.out.println(a2);
	}

}
	