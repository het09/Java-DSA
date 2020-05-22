
class NodeLO{
	int data;
	NodeLO left,right;
	public NodeLO(int item) {
		data = item;
		left = right = null;
	}
}

public class LevelOrder {
	
	NodeLO root;
	
	public LevelOrder() {
		root = null;
	}
	
	void printLevelOrder() {
		int h = height(root);
		int i;
		for(i=1; i<=h; i++) {
			printGivenLevel(root, i);
		}
	}
	
	int height(NodeLO root) {
		if(root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);
			
			if(lheight > rheight)
				return(lheight+1);
			else 
				return(rheight+1);
		}
	}
	
	void printGivenLevel(NodeLO root, int level) {
		if(root == null)
			return;
		if(level == 1)
			System.out.println(root.data);
		else if(level > 1) {
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}
	}
	
	public static void main(String[] args) {
		
		LevelOrder tree = new LevelOrder();
		tree.root= new NodeLO(1); 
	    tree.root.left= new NodeLO(2); 
	    tree.root.right= new NodeLO(3); 
	    tree.root.left.left= new NodeLO(4); 
	    tree.root.left.right= new NodeLO(5); 
	         
        System.out.println("Level order traversal of binary tree is "); 
        tree.printLevelOrder(); 
		
	}
}
