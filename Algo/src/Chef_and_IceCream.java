import java.util.Scanner;

public class Chef_and_IceCream {

	public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		for(int j = 0; j < t;j++)
	    {
	        int n,i,flag=1;
	        int sum = 0;
	        n = s.nextInt();
	        
	        int coin5=0,coin10=0,coin15=0;
            int a[] = new int[n];
            
	        for(i=0;i<n;i++)
	        {
	            a[i] = s.nextInt();
	            if(a[i]>5&&i==0)
	            {
	                flag=0;
	                break;
	            }

	            else
	            {if(a[i]==5)
	            coin5++;

	            else if(a[i]==10)
	            coin10++;

	            a[i]=a[i]-5;
	            
	            if(a[i]==5)
	            {
	                if(coin5<=0)
	                {
	                    flag=0;
	                    break;
	                }
	                coin5--;
	                
	            }

	            else if(a[i]==10)
	            {
	                if(coin10>0&&coin5>1)
	                coin10--;

	                else if(coin5>1&&coin10<=0)
	                coin5=coin5-2;

	                else if(coin5<=1&&coin10>0)
	                coin10--;

	                else if(coin5<=1||coin10<1)
	                {
	                    flag=0;
	                    break;
	                }
	            }}

	            
	        }

	        if(flag==0)
	        System.out.println("NO");

	        else 
	        	System.out.println("YES");

	    } 
	}

}
