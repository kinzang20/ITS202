public class bubblee{
	public static void bubble1sort(int [] arr)
	{
		int n = arr.length;
		int temp = 0;
		for(int i=0; i<n; i++){
			for(int j=1; (j<n-i); j++){
				if(arr[j-1] >arr[j]){
					//swap elements
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
		 		}
			}
		}
	}
	public static void main(String[]args){
		int arr1[]= {101,1,45,62,5,91,17};
		System.out.println("before the bubble sort");

		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]+"");
		}
		System.out.println();
		bubble1sort(arr1);

		System.out.println("After the bubble sort");

		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]+"");
		}
	} 
}