
class NodeSN
{
	int data;
	NodeSN next;
	NodeSN(int d){
		data = d;
		next = null;
	}
}

class Swap_Nodes {
	
	NodeSN head;
	
	public void swapNodes(int x, int y)
	{
		if(x == y)
			return;
		
		NodeSN prevX = null, currX = head;
		while(currX != null && currX.data != x) 
		{
			prevX = currX;
			currX = currX.next;
		}
		
		NodeSN prevY = null, currY = head;
		while(currY != null && currY.data != y)
		{
			prevY = currY;
			currY = currY.next;
		}
		
		if(currX == null || currY == null)
			return;
		
		if(prevX != null)
			prevX.next = currY;
		else
			head = currY;
		
		if(prevY != null)
			prevY.next = currX;
		else
			head = currX;
		
		NodeSN temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}
	
	public void push(int new_data)
	{
		NodeSN new_Node = new NodeSN(new_data);
		new_Node.next = head;
		head = new_Node;
	}
	
	public void printList() 
	{
		NodeSN tNode = head;
		while(tNode != null)
		{
			System.out.print(tNode.data+" ");
			tNode = tNode.next;
		}
	}
	
	public static void main(String[] args) {

		Swap_Nodes llist = new Swap_Nodes();
		
		llist.push(7); 
        llist.push(6); 
        llist.push(5); 
        llist.push(4); 
        llist.push(3); 
        llist.push(2); 
        llist.push(1); 
  
        System.out.print("\n Linked list before calling swapNodes() "); 
        llist.printList(); 
  
        llist.swapNodes(2, 6); 
  
        System.out.print("\n Linked list after calling swapNodes() "); 
        llist.printList(); 
		
	}

}
