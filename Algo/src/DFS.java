import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	
	int V;
	LinkedList<Integer> adj[];
	
	//Constructor
	DFS(int V){
		this.V= V;
		adj = new LinkedList[V];
		for(int i = 0; i < V; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	//Function to add an edge in a graph
	void addEdge(int u, int v) {
		adj[u].add(v);  //Adding v into u's list
	}
	
	void DFSUtil(int src,boolean visited[]) {
		//Mark current node visited and print it
		visited[src] = true;
		System.out.print(src+" ");
		
		//Recur for all vertices adjacent to this vertex
		Iterator<Integer> i = adj[src].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				DFSUtil(n,visited);
			}
		}
	}
	
	void DFSTraverse(int src) {
		boolean visited[] = new boolean[V];
		DFSUtil(src, visited);
	}
	
	public static void main(String[] args) {
		DFS d = new DFS(6);
		
		d.addEdge(0, 1);
		d.addEdge(1, 2);
		d.addEdge(2, 0);
		d.addEdge(2, 3);
		
		System.out.println("Following is DFS "+"(Starting from vertex 0)");
		
		d.DFSTraverse(3);
		
	}

}
