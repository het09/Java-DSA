class NodeIP
{
	char data;
	NodeIP left, right;
	
	NodeIP(char item){
		data = item;
		left = right = null;
	}
}

public class Tree_using_Inorder_Preorder {

	static int preIndex = 0;
	
	NodeIP buildTree(char in[], char pre[], int inSt, int inEd) {
		if(inSt > inEd)
			return null;
		
		NodeIP tNode = new NodeIP(pre[preIndex++]);
		
		if(inSt == inEd) 
			return tNode;
		
		int inIndex = search(in, inSt, inEd, tNode.data);
		
		tNode.left = buildTree(in, pre, inSt, inIndex - 1);
		tNode.right = buildTree(in, pre, inIndex + 1, inEd);
		
		return tNode;
		
	}
	
	int search(char arr[], int st, int ed, char value) {
		int i;
		for(i = st; i <= ed; i++) {
			if(arr[i] == value)
				return i;
		}
		return i;
	}
	
	void printInorder(NodeIP node) {
		if(node == null)
			return;
		
		printInorder(node.left);
		System.out.println(node.data + " ");
		
		printInorder(node.right);
	}
	
	public static void main(String[] args) {
		Tree_using_Inorder_Preorder tree = new Tree_using_Inorder_Preorder();
		
		char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' }; 
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' }; 
        int len = in.length; 
        NodeIP root = tree.buildTree(in, pre, 0, len - 1); 
  
        tree.printInorder(root); 
	}

}
