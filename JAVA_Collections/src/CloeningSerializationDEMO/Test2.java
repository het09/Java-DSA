package CloeningSerializationDEMO;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Het");
		al.add("Param");
		al.add("Yash");
		al.add("Meet");
		
		ArrayList<String> copy =(ArrayList<String>)al.clone();
		System.out.println(copy);
	}

}
