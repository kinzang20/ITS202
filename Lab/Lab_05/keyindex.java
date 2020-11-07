public class keyindex{
	public void counting(int [] a){
		int R = 256;
		int N = a.length;
		int [] aux= new int[N];
		int [] count = new int [R+1];

		//Compute for fraquency Count
		for(int i=0; i<N; i++){
			count[a[i] + 1]++;
		}

		// Transform counts into indices
		for(int r=0; r<R; r++){
			count[r+1] += count[r];
		}

		// Distribute The record
		for(int i=0; i<N; i++){
			aux[count[a[i]]++] = a[i];
		}

		//copy back
		for(int i=0; i<N; i++){
			a[i] = aux[i];
		}
	}
	public static void main(String[] args){
		int [] a={2,4,3,1,0,6,7,9};
		keyindex obj= new keyindex();
		obj.counting(a);

		for(int i=0; i<a.length; i++){
			System.out.println(" "+a[i]);
		}
	}
}