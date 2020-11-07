public class insertionn{
	public static void insertionsort(int array[]){
		int n = array.length;

		for(int i=1; i<n; i++){
			int compare=array[i];
			int j = i-1;

			while((j>=0) && (array[j]>compare)){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=compare;
		}
	}
	public static void main(String[] args){
		int array1[]= {91,3,89,26,7,2,17};
		System.out.println("before the insertion sort");

		for(int j:array1){
			System.out.println(j+" ");
		}
		insertionsort(array1);

		System.out.println("After the insertion sort");

		for(int j:array1){
			System.out.println(j+" ");
		}
	}
}