
public class KMP {
	
	static int lsp[];
	
	static void preProcess(String pat) {
		int i = 0, j = -1;
		lsp[0] = -1;
		
		while(i < pat.length()) {
			while(j >= 0 && pat.charAt(i) != pat.charAt(j)) {
				j = lsp[j];
			}
			i++;
			j++;
			lsp[i] = j;
		}
	}
	
	static void KMPSearch(String str, String pat) {
		preProcess(pat);
		
		int i = 0, j = 0;
		
		while(i < str.length()) {
			while(j >= 0 && str.charAt(i) != pat.charAt(j)) {
				j = lsp[j];
			}
			i++;
			j++;
			if(j == pat.length()) {
				System.out.println("Pattern is found at " + (i - j));
				j = lsp[j];
			}
		}
		
	}

	public static void main(String[] args) {

		String str = "ABABDABACDABABCABAB"; 
        String pat = "ABABCABAB"; 
        
		 KMP.KMPSearch(str, pat);
	}

}
