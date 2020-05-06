import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		
		//Declare an array
		int[] arr = new int[n];
		
		System.out.println("Enter the values in an array");
		
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println("Enter the value to be searched");
		int num = s.nextInt();
		
		int low = 0;
		int high = n-1;
		int mid = 0;
		
		while(low <= high)
		{
			mid = (low + high)/2;
			if(num == arr[mid]) {
				System.out.println("Value is found: "+mid);
				break;
			}
			else if(num < arr[mid]){
				high = mid - 1;
			}
			else if(num > arr[mid]) {
				low = mid + 1;
			}
		}
		
		if(low > high)
		{
			System.out.println("Value is not found in array");
		}
	}

}
