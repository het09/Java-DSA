
public class LPS_DynamicSolution {

	static int max(int x, int y) {
		return (x > y) ? x : y;
	}
	
	static int lps(String seq) {
		
		int n = seq.length();
		int i,j,k;
		
		int L[][] = new int[n][n];
		
		for(i = 0; i < n; i++) {
			L[i][i] = 1;
		}
		
		
		for (k=2; k<=n; k++) 
        { 
            for (i=0; i<n-k+1; i++) 
            { 
                j = i+k-1; 
                if (seq.charAt(i) == seq.charAt(j) && k == 2) 
                L[i][j] = 2; 
                else if (seq.charAt(i) == seq.charAt(j)) 
                L[i][j] = L[i+1][j-1] + 2; 
                else
                L[i][j] = max(L[i][j-1], L[i+1][j]); 
            } 
        } 
              
        return L[0][n-1]; 
		
	}
	
	public static void main(String[] args) {
		String seq = "GEEKSFORGEEKS"; 
        int n = seq.length(); 
        System.out.println("The length of the lps is "+ lps(seq)); 
	}

}
