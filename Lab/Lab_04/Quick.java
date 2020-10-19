public class Quick {

   //  /**
   //   * Rearranges the array in ascending order, using the natural order.
   //   * @param a the array to be sorted
   //   */
    public static void sort(int[] x) {
        //shuffle(a);
        sort(x, 0, x.length - 1);
    
    }

    // quicksort the subarray from a[lo] to a[hi]
    private static void sort(int[] x, int lo, int hi) { 
        if (hi <= lo) return;
        int j = partition(x, lo, hi);
        sort(x, lo, j-1);
        sort(x, j+1, hi);
    }

    // partition the subarray a[lo..hi] so that a[lo..j-1] <= a[j] <= a[j+1..hi]
    // and return the index j.
    private static int partition(int[] x, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = x[lo];
        while (true) { 

            // find item on lo to swap
            while (less(x[++i], v)) {
                if (i == hi) break;
            }

            // find item on hi to swap
            while (less(v, x[--j])) {
                if (j == lo) break;      // redundant since a[lo] acts as sentinel
            }

            // check if pointers cross
            if (i >= j) break;

            exch(x, i, j);
        }

        // put partitioning item v at a[j]
        exch(x, lo, j);

        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
        
    }

   // /***************************************************************************
   //  *  Helper sorting functions.
   //  ***************************************************************************/
    
    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        if (v == w) return false;   // optimization when reference equals
        return v.compareTo(w) < 0;
        
     }
     // exchange a[i] and a[j]
    private static void exch(int[] x, int i, int j) {
        int swap = x[i];
        x[i] = x[j];
        x[j] = swap;  
    }
   // /***************************************************************************
   //  *  Check if array is sorted - useful for debugging.
   //  ***************************************************************************/
    private static boolean isSorted(int[] x) {
        return isSorted(x, 0, x.length - 1);   
    }
    private static boolean isSorted(int[] x, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(x[i], x[i-1])) return false;
        return true;  
    }
    // print array to standard output
    private static void show(int[] x) {
        for (int i=0; i<x.length ;i++ ) {
            System.out.print(x[i]);  
        }
    }

    /**
     * Reads in a sequence of values ; quicksorts them; 
     * and prints them to standard output in ascending order. 
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] x = {1,8,9,0};
        System.out.println("elements before sorting:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        } 
        Quick.sort(x);
        System.out.println("");
        System.out.println("elements after sorting: ");
        show(x);
        System.out.println("");
       assert isSorted(x);

    }

}