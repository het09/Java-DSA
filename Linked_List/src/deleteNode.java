
public class deleteNode {

	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void delete(int key) {
		Node temp = head, prev = null;
		
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null) {
			return;
		}
		
		prev.next = temp.next;
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
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
		
		deleteNode dn = new deleteNode();
		
		dn.push(7);
		dn.push(9);
		dn.push(2);
		dn.push(13);
		dn.push(16);
		
		System.out.println("\nLinked List is: ");
		dn.printList();
		
		dn.delete(9);
		
		System.out.println("\nLinked List after deletion is: ");
		dn.printList();
	}

}
