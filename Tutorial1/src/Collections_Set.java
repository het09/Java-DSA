import java.util.HashSet;
import java.util.Iterator;

public class Collections_Set {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		// Here data is not added as in indexing approach
		// We got hashCodes for elements which are being added
		set.add("Het");
		set.add("Param");
		set.add("Het");
		set.add("Godhani");
		set.add("Yash");
		set.add("Het");
		set.add("Meet");
		
		// 1. Data is Unique, no Redundancy
		// 2. Data is unordered in output due to hashing
		System.out.println("Set is :"+set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		set.remove("Godhani");
		System.out.println(set);
		
		if(set.contains("Het")) {
			System.out.println("Het is in the set");
		}
		
		System.out.println("Set size is :" +set.size());
		
		
	}

}
