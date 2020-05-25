
class NodeNth{
	int data;
	NodeNth next;
	NodeNth(int d){
		data = d;
		next = null;
	}
}

public class NthNode {

	NodeNth head;
	
	public int GetNth(int index) {
		NodeNth current = head;
		int count = 0;
		
		while(current != null) {
			if(count == index)
				return current.data;
			count++;
			current = current.next;
		}
		
		assert(false);
		return 0;
	}
	
	public void push(int new_data) {
		
		NodeNth new_node = new NodeNth(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public static void main(String[] args) {
		
		NthNode llist = new NthNode();
		
		llist.push(1); 
        llist.push(4); 
        llist.push(1); 
        llist.push(12); 
        llist.push(1); 
  
        System.out.println("Element at index 1 is "+llist.GetNth(1)); 
	}

}
