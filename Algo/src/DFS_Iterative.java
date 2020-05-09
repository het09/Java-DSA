import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class DFS_Iterative {

	static class Graph
	{
	int V;
	LinkedList<Integer> adj[];
	
	//Constructor
	Graph(int V){
		this.V= V;
		adj = new LinkedList[V];
		for(int i = 0; i < V; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	//Function to add an edge in a graph
	void addEdge(int u, int v) {
		adj[u].add(v);  //Adding v into u's list
	}
	
	//prints all not yet visited vertices reachable from s
	void DFS(int s) {
		// Initially mark all vertices as not visited
		Vector<Boolean> visited = new Vector<Boolean>(V);
		for(int i = 0; i < V; i++) {
			visited.add(false);
		}
		
		// Create a stack for DFS
		Stack<Integer> stack = new Stack<>();
		
		// Push the current source node
		stack.push(s);
		
		while(stack.empty() == false) {
			// Pop a vertex from stack and print it
			s = stack.peek();
			stack.pop();
			
			if(visited.get(s) == false) {
				System.out.print(s + " ");
				visited.set(s, true);
			}
			
			Iterator<Integer> itr = adj[s].iterator();
			
			while(itr.hasNext()) {
				int u = itr.next();
				if(!visited.get(u)) {
					stack.push(u);
				}
			}
		}
		
		
	}
}
	public static void main(String[] args) {

		Graph g = new Graph(5);
		
		g.addEdge(1, 0);
		g.addEdge(0, 2);
		g.addEdge(2, 1);
		g.addEdge(0, 3);
		g.addEdge(3, 4);
		g.addEdge(1, 4);

		System.out.println("Following is DFS "+"(Starting from vertex 0)");
		
		g.DFS(0);
	}
}
