import java.util.Scanner;

public class selection{
	void selectionSort(int array[]){
		int w = array.length;
		for (int i = 0; i < w + 1;i++) {
			int pick = i;
			for (int j=i+1;j<w ;j++ ) {
				if (array[j] < array[pick]){
					pick = j;
				}
			}
			int part = array[pick];
			array[pick] = array[i];
			array[i] = part;
		}
	}
	void printing(int array[]){
		int w = array.length;
		for (int i : array ) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args){
		selection ob = new selection();

		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length = obj.nextInt();
		
		int array[] = new int[length];

		for (int i = 0; i < length; i++){
			System.out.print("Enter array elements: ");
			int a = obj.nextInt();
			array[i] = a;
		}

		System.out.print("Your unsorted array is: ");
		for (int j=0;j<array.length; j++){
			System.out.print(" "+array[j]+" ");
		}

		//calling the method
		ob.selectionSort(array);
		System.out.print("\n");
		System.out.print("Your sorted array: ");
		ob.printing(array);
		System.out.print("\n");
	}
}