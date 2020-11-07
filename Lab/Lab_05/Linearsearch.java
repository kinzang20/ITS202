public class Linearsearch{
	public static int Linear(int arr1[], int key){
		for(int i=0; i<arr1.length; i++){
			if(arr1[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={1,3,7,4,9};
		int key=7;
		System.out.println(key+"index found"+Linear(arr,key));
	}

}