public class insertion{
	public static void insertionsort(int array[]){
		int n = array.length;

		for(int i=1; i<n; i++){
			int key=array[i];
			int  j = i-1;

		while((j>=0) && (array[j]>key))
		{
			array[j+1]=array[j];
		j--;

		}
		array[j+1]=key;
	}
	}
	public static void main(String[]args){
		int array1[]= {928,7,4,17,83,56,36,1};
		System.out.println("before the insertion sort");

		for(int j:array1){
			System.out.print(j+" ");
		}
		insertionsort(array1);

		System.out.println("after the insertion sort");

		for(int j:array1){
			System.out.print(j+" ");
		}

	}
}