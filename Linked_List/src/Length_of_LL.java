
class NodeL{
	int data;
	NodeL next;
	NodeL(int d){
		data = d;
		next = null;
	}
}


public class Length_of_LL {

	NodeL head;
	
	public void push(int new_data) {
		NodeL new_node = new NodeL(new_data);
		
		new_node.next = head;
		
		head = new_node;
	}
	
	public int getCount() {
		NodeL temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Length_of_LL llist = new Length_of_LL();
		llist.push(1); 
        llist.push(3); 
        llist.push(1); 
        llist.push(2); 
        llist.push(1);
        llist.push(1);
        
  
        System.out.println("Count of nodes is " + 
                           llist.getCount()); 
	}

}
