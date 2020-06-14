import java.util.Scanner;

public class Chef_and_PriceControl {
	
	// Method -1 
	/*static int totalLoss(int[] p , int k){
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i < p.length; i++) {
			
			if(p[i] > k) {
				sum2 += k;
			}
			else {
				sum2 += p[i];
			}
			
			sum1 += p[i];
				
		}
		return (sum1 - sum2);
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int t = sc.nextInt();
		
		for(int i = 0; i < t ; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int p[] = new int[n];
			
			for(int j = 0; j < n; j++) {
				p[j] = sc.nextInt();
			}
			
			System.out.println(Chef_and_PriceControl.totalLoss(p, k));
		}
		
	}*/
	
	// Method 2
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int t = sc.nextInt();
		
		for(int i = 0; i < t ; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int sum1 = 0;
			int sum2 = 0;
			
			for(int j = 0; j < n; j++) {
				int x = sc.nextInt();
				
				if(x > k) {
					sum2 += k;
				}
				else {
					sum2 += x;
				}
				
				sum1 += x;
			}
			
			System.out.println(sum1 - sum2);
		}

}
}
