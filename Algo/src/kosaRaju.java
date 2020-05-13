import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class kosaRaju {

	
	int V;   

    LinkedList<Integer> adj[]; 

	kosaRaju(int v) 
    { 
		V=v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList(); 
    }

	void addEdge(int u, int v) 
    { 
        adj[u].add(v);    
    } 
    
    void DFS(int v,boolean visited[]) 
    { 
        visited[v] = true; 
        System.out.print(v+" "); 
  
        Iterator<Integer> i = adj[v].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                DFS(n,visited); 
        } 
    } 
    
    kosaRaju transpose() {
		kosaRaju kr = new kosaRaju(V);
		for(int v = 0; v<V;v++) {
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()) {
			kr.adj[i.next()].add(v);
		}
		}
    	return kr;
    	
    }
    
    void DFSStack(int v,boolean visited[], Stack stack) {
    	visited[v] = true;
    	Iterator<Integer> i = adj[v].listIterator();
    	while(i.hasNext()) {
    		int n = i.next();
    		if(!visited[n]) {
    			DFSStack(n, visited, stack);
    		}
    	}
    	stack.push(v);
    }
    
    
    
    void kosa() {
    	Stack stack = new Stack();
    	boolean visited[] = new boolean[V];
    	
    	for(int i = 0;i<V;i++) {
    		visited[i] = false;
    	}
    	
    	
    	for(int i = 0;i< V;i++) {
    		if(!visited[i]) {
    			DFSStack(i, visited, stack);
    		}
    	}
    	kosaRaju trans = transpose();
    	
    	for(int i = 0;i< V;i++) {	
    		visited[i] = false;
    	}
    	
    	while(!stack.isEmpty()) {
    		int n = (int) stack.pop();
    		if(!visited[n]) {
    			trans.DFS(n, visited);
    			System.out.println();
    		}
    	}
    }
    
    
	public static void main(String[] args) {
		kosaRaju kr = new kosaRaju(5); 
        kr.addEdge(1, 0); 
        kr.addEdge(0, 2); 
        kr.addEdge(2, 1); 
        kr.addEdge(0, 3); 
        kr.addEdge(3, 4); 
  
        System.out.println("Following are strongly connected components "+  "in given graph "); 
        kr.kosa(); 

	}

}
