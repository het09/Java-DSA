
public class LCS_Dynamic {

	static int lcs(char[] x, char[] y, int m, int n) {
		int L[][] = new int[m+1][n+1];
		
		for(int i=0; i<=m; i++) 
		{
			for(int j=0; j<=n; j++)
			{
				if(i == 0 || j == 0)
					L[i][j] = 0;
				else if(x[i-1] == y[j-1])
					L[i][j] = L[i-1][j-1] + 1;
				else
					L[i][j] = max(L[i-1][j], L[i][j-1]);
			}
		}
		
		
		// To print the LCS
		int k = L[m][n];
		char[] lcsArray = new char[L[m][n] + 1];
		lcsArray[k] = '\u0000';
		
		int i = m, j = n;
		while(i >  0 && j > 0)
		{
			if(x[i-1] == y[j-1]) {
				lcsArray[k-1] = x[i-1];
				i--;
				j--;
				k--;
			}
			else if(L[i - 1][j] > L[i][j - 1]) {
				i--;
			}
			else {
				j--;
			}
		}
		
		System.out.println(lcsArray);
		return L[m][n];
		
	}
	
	static int max(int a, int b) {
		return (a > b)? a : b;
	}
	
	
	
	public static void main(String[] args) {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence(); 
	    String s1 = "AHHTTPHPHAH"; 
	    String s2 = "HPATPAAHAH"; 
	  
	    char[] x=s1.toCharArray(); 
	    char[] y=s2.toCharArray(); 
	    int m = x.length; 
	    int n = y.length; 
	  
	    lcs(x,y,m,n);
	    System.out.println("Length of LCS is" + " " + 
	                                  lcs.lcs( x, y, m, n ) ); 
	  
	} 
	
}



