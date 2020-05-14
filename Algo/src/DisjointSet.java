
public class DisjointSet {
	int n;
	int[] rank;
	int[] parent;
	
	DisjointSet(int n){
		this.n=n;
		parent = new int[n];
		rank = new int[n];
		createSet();
	}
	
	void createSet() {
		for(int i = 0; i < n; i++) {
			parent[i]= i;
		}
	}
	
	int findParent(int x) {
		if(parent[x] != x) {
			parent[x] = findParent(parent[x]);
		}
		return parent[x];
	}
	
	void union(int x,int y){
		int xRoot = findParent(x);
		int yRoot = findParent(y);
		
		if(xRoot == yRoot) {
			return;
		}else if(rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;
		}else if(rank[xRoot] > rank[yRoot]) {
			parent[yRoot] = xRoot;
		}else {
			parent[yRoot] = xRoot;
			rank[yRoot] = rank[yRoot] + 1;
		}
	}

	public static void main(String[] args) {
		
        int n = 5; 
        DisjointSet ds =  new DisjointSet(n); 
  
        ds.union(0, 2); 

        ds.union(4, 2);
  
        ds.union(3, 1); 
   
        if (ds.findParent(4) == ds.findParent(2)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
  
        
        if (ds.findParent(1) == ds.findParent(0)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 

}


