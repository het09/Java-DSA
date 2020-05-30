
public class Count_In_LL {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	
	int count(int search_for)
	{
		Node current = head;
		int count = 0;
		while(current != null) {
			if(current.data == search_for)
				count++;
			current = current.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Count_In_LL llist = new Count_In_LL();
		
		llist.push(1); 
        llist.push(2); 
        llist.push(1); 
        llist.push(3); 
        llist.push(1); 
  
        System.out.println("Count of 1 is " + llist.count(1)); 
	}

}
