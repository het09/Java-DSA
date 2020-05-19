
public class insertNode {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	// Insert a node at front of the list
	
	public void insertAtFront(int new_data) {
		
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		
		head = new_node;
	}
	
	// Insert a node at end of the list
		public void insertAtEnd(int new_data) {
			
			Node new_node = new Node(new_data);
			
			if(head == null) {
				head = new Node(new_data);
				return;
			}
			
			new_node.next = null;
			
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			
			last.next = new_node;
			return;
		}
		
		// Insert a node after given prev_node of the list
		public void insertAfter(Node prev_node, int new_data) {
			if(prev_node == null) {
				System.out.println("It cannot be null!");
				return;
			}
			
			Node new_node = new Node(new_data);
			new_node.next = prev_node.next;
			
			prev_node.next = new_node;
		}
		
		public void printList() 
	    { 
	        Node tnode = head; 
	        while (tnode != null) 
	        { 
	            System.out.print(tnode.data+" "); 
	            tnode = tnode.next; 
	        } 
	    } 
		
	
	public static void main(String[] args) {
		
		insertNode in = new insertNode();
		in.insertAtEnd(6);
		in.insertAtFront(7);
		in.insertAtFront(1);
		in.insertAtFront(9);
		in.insertAtEnd(4);
		in.insertAfter(in.head.next.next, 10);

		System.out.println(in);
		in.printList();
	}

}
