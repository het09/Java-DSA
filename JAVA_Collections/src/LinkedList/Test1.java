package LinkedList;

import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Het");
		ll.add("Param");
		ll.add("Abhita");
		ll.add("Param Patel");
		ll.add(null);
		System.out.println(ll);
		
		ll.addFirst("haresh");
		ll.addLast("zzz");
		System.out.println(ll);
		System.out.println(ll.size());
		
		ll.add(2,"Godhani");
		System.out.println(ll);
		
		ll.set(1, "Het Patel");
		
		ll.remove(1);
		ll.remove("Abhita");
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println(ll.isEmpty());
		

	}

}
