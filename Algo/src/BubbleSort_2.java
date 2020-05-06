
public class BubbleSort_2 {

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0] = 7;
		arr[1] = 5;
		arr[2] = 9;
		arr[3] = 2;
		arr[4] = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int x : arr) {
			System.out.println(x);
		}
	}

}
