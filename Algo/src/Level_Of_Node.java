import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Level_Of_Node {

	static void printLevels(Vector<Vector<Integer>> graph, int V, int x)
	{
		int level[] = new int[V];
		boolean marked[] = new boolean[V];
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(x);
		level[x] = 0;
		marked[x] = true;
		
		while(q.size() > 0) {
			x = q.peek();
			q.remove();
			
			for(int i = 0; i < graph.get(x).size(); i++)
			{
				int b = graph.get(x).get(i);
				if(!marked[b])
				{
					q.add(b);
					level[b] = level[x] + 1;
					marked[b] = true;
				}
			}
		}
		System.out.println("Nodes"
				            + " "
							+ "Level");
		for(int i = 0; i < V; i++) {
			System.out.println(" " + i +" --> " + level[i]);
		}
	}
	
	
	public static void main(String[] args) {

		int V = 8;
		Vector<Vector<Integer>> graph=new Vector<Vector<Integer>>();  
	      
		for(int i = 0; i < V + 1; i++) 
		graph.add(new Vector<Integer>()); 
		  
	    graph.get(0).add(1);  
	    graph.get(0).add(2);  
	    graph.get(1).add(3);  
	    graph.get(1).add(4);  
	    graph.get(1).add(5);  
	    graph.get(2).add(5);  
	    graph.get(2).add(6);  
	    graph.get(6).add(7);  
		  
	    printLevels(graph, V, 0);  
	}

}
