package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(111, "java", "Het"));
		books.add(new Book(222, "C", "Param"));
		books.add(new Book(333, "CPP", "Yash"));
		
		Iterator<Book> itr = books.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			if(b.id==111)
				itr.remove();
			if(b.name.equals("CPP"))
				itr.remove();
		}
		
		for(Book b:books)
		{
			System.out.println(b.id+ " "+b.name+ " "+b.author);
		}
	}

}
