class NodeS{
	int data;
	NodeS left, right;
	
	public NodeS(int d) {
		data = d;
		left = right = null;
	}
}

class spiralOrder {
	
	NodeS root;
	
	void printSpiral(NodeS node) {
		int h = height(node);
		int i;
		
		boolean ltr = false;
		for(i = 1; i <= h; i++) {
			printGivenLevel(node, i, ltr);
			ltr = !ltr;
		}
	}
	
	int height(NodeS node) {
		if(node == null)
			return 0;
		else {
			int lheight = height(node.left);
			int rheight = height(node.right);
			
			if(lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}
	
	void printGivenLevel(NodeS node, int level, boolean ltr) {
		if(node == null)
			return;
		if(level == 1)
			System.out.println(node.data + " ");
		else if(level > 1) {
			if(ltr != false) {
				printGivenLevel(node.left, level - 1, ltr);
				printGivenLevel(node.right, level - 1, ltr);
			}
			else {
				printGivenLevel(node.right, level - 1, ltr);
				printGivenLevel(node.left, level - 1, ltr);
			}
		}
	}

	public static void main(String[] args) {
		
		spiralOrder tree = new spiralOrder();
		tree.root = new NodeS(1); 
        tree.root.left = new NodeS(2); 
        tree.root.right = new NodeS(3); 
        tree.root.left.left = new NodeS(4); 
        tree.root.left.right = new NodeS(5); 
        tree.root.right.left = new NodeS(6); 
        tree.root.right.right = new NodeS(7);
        
        tree.printSpiral(tree.root);
	}

}
