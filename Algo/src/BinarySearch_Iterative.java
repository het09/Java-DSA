import java.util.Scanner;

public class BinarySearch_Iterative {

	int binarySearch(int arr[],int x)
	{
		int l=0, h = arr.length - 1;
		while(l <= h) {
			int m = (l + (h-1)) / 2;
			
			if(x == arr[m]) 
				return m;
			
			if(x < arr[m])
				h = m - 1;
			
			else
				l = m + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		BinarySearch_Iterative ob = new BinarySearch_Iterative();
		int arr[] = { 2, 4, 6, 8, 12};
		int n = arr.length;
		int x = 8;
		int result = ob.binarySearch(arr, x);
		if(result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index" + result);
	}

}
