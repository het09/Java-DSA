
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
	
	public static void main(String[] args) {
		
		insertNode in = new insertNode();
		in.insertAtFront(1);
		in.insertAtFront(3);
		in.insertAtFront(7);

		System.out.println(in);
	}

}
