import java.util.ArrayList;
import java.util.Iterator;

public class Collections_Arraylist {

	public static void main(String[] args) {
		
		//It can store only string objects
		ArrayList<String> list1 = new ArrayList<String>(); 
		
		//It can store any type of objects
		ArrayList list2 = new ArrayList();
		
		Student s1 = new Student();
		s1.roll = 9;
		s1.name = "het";

		//1. add data in list1
		list1.add("het");
		list1.add("Param");
		list1.add("yash");
		list1.add("meet");
		list1.add("nildeep");
		list1.add("nishant");
		
		//add data in list2
		list2.add(7);
		list2.add("Het");
		list2.add(9);
		list2.add(7.9);
		list2.add(s1);
		
		System.out.println("List1 :"+list1);
		System.out.println("List2 :"+list2);
		
		//2. Get the element from list
		
		String name = list1.get(2);
		System.out.println("Name is :"+name);
		
		Object o = list2.get(2);
		System.out.println("O is :"+o);
		
		//3. Update element in list
		
		list2.set(2,"Godhani" );
		System.out.println("List2 now is :"+list2);
		
		//4. Remove element from list
		
		list2.remove(2);
		System.out.println("List2 after deletion :"+list2);
		
		//5. list2.clear(); -->Remove ALL
		
		//6. Searching element in list 
		
		if(list1.contains("Param")){
			System.out.println("Param is in the list");
		}
		
		//7. Iterate in array list
		
		System.out.println("==Iterating with ForEach Loop==");
		for(String str : list1) {
			System.out.println(str);
		}
		System.out.println("========");
		
		//Iterator is going to give element one by one when we call the method next()
		System.out.println("==Iterating with Iterator");
		Iterator<String> itr = list1.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		//For entire loop to print
		/*while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}*/
		
	}

}
class Student{
	int roll;
	String name;
}