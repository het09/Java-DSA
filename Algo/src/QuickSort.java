
public class QuickSort {
	
	int partition(int arr[],int low,int high) {
		int pivot = arr[high];
		int i = (low-1);
		
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	void sort(int arr[], int low, int high) {
		if(low < high) {
			int par = partition(arr, low, high);
			sort(arr, low, par-1);
			sort(arr,par+1,high);
		}
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; ++i) {
			System.out.println(arr[i]+" ");
			
		}
	}

	public static void main(String[] args) {
		int arr[] = {10,7,8,9,1,5};
		int n = arr.length;
		
		QuickSort o = new QuickSort();
		o.sort(arr, 0, n-1);
		
		System.out.println("Sorted array");
		printArray(arr);
	}

}
