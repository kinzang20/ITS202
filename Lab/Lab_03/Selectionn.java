public class Selectionn{
	void sort(int arr[]){
		int n = arr.length;

		// one by one move boundary of unsorted subarray
		for(int i = 0; i < n-1; i++){
			// Find the minimum element in  unsorted array
			int min_pick = i;
			for(int j = i+1; j < n; j++)
				if(arr[j] < arr[min_pick])
					min_pick = j;

				//swap the found minimum element with the first
				// element
				int temp = arr[min_pick];
				arr[min_pick] = arr[i];
				arr[i] = temp;
		}
	}
	// prints the array
	void printArray(int arr[]){
		int n = arr.length;
		for(int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	// Driver code to test above
	public static void main(String []args){
		Selectionn ob = new Selectionn();
		int arr[] = {99,1,45,26,67,36};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}