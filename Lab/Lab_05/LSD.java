public class LSD{
	public static void sort(String[] a, int k){
		// Sort a[] on leading k characters.
		int N= a.length;
		int R= 256;
		String[] aux= new String[N];
		for(int e = k-1; e>=0; e--){
			// sot by key indexexd counting on eth char
			int[] count= new int[R+1];
			// compute frequency count
			for(int i=0; i<N; i++){
				count[a[i].charAt(e) +1]++;
			}
			// Transform Count into indices
			for(int r=0; r<R; r++){
				count[r+1] +=count[r];
			}
			//Distribute the Record
			for(int i=0; i<N; i++){
				aux[count[a[i].charAt(e)]++]=a[i];
			}
			// Copy back
			for(int i=0; i<N; i++){
			a[i] = aux[i];
			
		}

		}
		for(int i=0;i<N;i++){
			System.out.println(" "+a[i]);
		
	}
	}
	public static void main(String [] args){
		String[] a={"pema","dawa","nima"};
		LSD obj= new LSD();
		obj.sort(a,4);
	}
}