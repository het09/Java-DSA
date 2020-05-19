import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("A");
		l.add("B");
		l.addLast("C");
		l.addFirst("D");
		l.add(2, "E");
		l.add("F");
		l.add("G");
		System.out.println("Linked list : "+ l);
		
		l.remove("B");
		l.remove(3);
		l.removeFirst();
		l.removeLast();
		System.out.println("Linked list after deletion: " +l);
		
		boolean status = l.contains("E");
		
		if(status)
			System.out.println("It contains 'E");
		else
			System.out.println("It doesn't contains 'E");
		
		int size = l.size();
		System.out.println("Size of linked list = "+size);
		
		Object element = l.get(2);
		System.out.println("Element returned by get() : "+ element);
		l.set(2, "Y");
		System.out.println("Linked list after changed :" +l);
		
	}

}
