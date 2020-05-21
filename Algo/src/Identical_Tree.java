
class NodeIT{
	int data;
	NodeIT left, right;
	NodeIT(int item){
		data = item;
		left = right = null;
	}
}

public class Identical_Tree {

	NodeIT root1, root2;
	
	boolean identicalTree(NodeIT a, NodeIT b)
	{
		if(a == null && b == null) {
			return true;
		}
		
		if(a != null && b != null) {
			return(a.data == b.data && identicalTree(a.left,b.left)
					 && identicalTree(a.right,b.right));
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		Identical_Tree tree = new Identical_Tree();
		
		tree.root1 = new NodeIT(1); 
        tree.root1.left = new NodeIT(2); 
        tree.root1.right = new NodeIT(3); 
        tree.root1.left.left = new NodeIT(4); 
        tree.root1.left.right = new NodeIT(5); 
   
        tree.root2 = new NodeIT(1); 
        tree.root2.left = new NodeIT(2); 
        tree.root2.right = new NodeIT(3); 
        tree.root2.left.left = new NodeIT(4); 
        tree.root2.left.right = new NodeIT(5); 
   
        if (tree.identicalTree(tree.root1, tree.root2)) 
            System.out.println("Both trees are identical"); 
        else
            System.out.println("Trees are not identical"); 
	}

}
