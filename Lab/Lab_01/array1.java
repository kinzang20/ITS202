public class array1{
	public static void main(String[] args) {
		int[] arr={10,20,30,40,50}; //declaring and assigning value to the array

		for (int i = 0; i < arr.length; i++){ 
        System.out.println( arr[i]);    //printing the array     
      }


      //different way of creating arrayy.
		int[] array; //declaring the array vsaviable
		array=new int[5]; //declaring the size of array

		array[0]=1;
		array[1]=3; //array initialization

		array[2]=7;
		array[3]=4;
		array[4]=8;

		for (int i = 0; i<array.length; i++){
			System.out.println("value of " +i+ ":" +array[i]);
		}
    }
} 