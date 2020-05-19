package CloeningSerializationDEMO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class Test3 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		System.out.println(al instanceof List);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof RandomAccess);
		
		System.out.println(" ");
		
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println(ll instanceof List);
		System.out.println(ll instanceof Cloneable);
		System.out.println(ll instanceof Serializable);
		System.out.println(ll instanceof RandomAccess);
		
		
	}

}
