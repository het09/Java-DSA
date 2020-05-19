class NodeT
{
	int key;
	NodeT left, right;
	
	public NodeT(int item) {
		key = item;
		left = right = null;
	}
}


public class Tree_Traversals 
{

	NodeT root;
	Tree_Traversals()
	{
		root = null;
	}
	
	void printInorder(NodeT node) 
	{
		if(node == null) {
			return;
		}
		
		printInorder(node.left);
		System.out.println(node.key + " ");
		printInorder(node.right);
	}
	
	void printPreorder(NodeT node)
	{
		if(node == null) {
			return;
		}
		
		System.out.println(node.key + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	
	void printPostorder(NodeT node)
	{
		if(node == null) {
			return;
		}
		
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.println(node.key + " ");
	}
	
	void printInorder() {
		printInorder(root);
	}
	
	void printPreorder() {
		printPreorder(root);
	}
	
	void printPostorder() {
		printPostorder(root);
	}
	
	public static void main(String[] args) {

		Tree_Traversals tree = new Tree_Traversals();
		tree.root = new NodeT(1);
		tree.root.left = new NodeT(2);
		tree.root.right = new NodeT(3);
		tree.root.left.left = new NodeT(4);
		tree.root.left.right = new NodeT(5);
		
		System.out.println("Inorder traversal of binary tree is ");
		tree.printInorder();
		
		System.out.println("\nPreorder traversal of binary tree is ");
		tree.printPreorder();
		
		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder();
	}

}
