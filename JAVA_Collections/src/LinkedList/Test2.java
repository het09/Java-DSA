package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test2 {

	public static void main(String[] args) {
		
		LinkedList<Book> l = new LinkedList<Book>();
		l.add(new Book(111,"java","Het"));
		l.add(new Book(222,"c","Param"));
		l.add(new Book(333,"cpp","Yash"));
		
		//by using listIterator remove : c
		ListIterator<Book> lstr = l.listIterator();
		while(lstr.hasNext()) {
			Book b = lstr.next();
			if(b.name.equals("c")) {
				lstr.remove();
			}
		}
		
		for(Book b :l) {
			System.out.println(b.id+" "+b.author+" "+b.name);
		}
	}

}
