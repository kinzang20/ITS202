import java.util.*;

public class Solution<Key extends Comparable<Key>, Value> {
    private Node root;             // root of BST

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;          // number of nodes in subtree

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public Solution() {
        root = null;
    }

    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        if (size() == 0)
            return true;
        return false;
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size(Node X) {
      return size(rot);

      if (x == null)
        return 0;
    return x.size;
       
    }

    /**
     * Does this symbol table contain the given key?
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key} and
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    // public boolean contains(Key key) {
       
    // }

    /**
     * Returns the value associated with the given key.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Node x, Key key) {
        if (key == null){
            throw new IllegalArgumentException("key is null");
         }
        return get(root, key);

        if(x == null){
            return null;
        }
        int cmp = key.CpmparableTo(x.key);

        if (cmp < 0){
            get(x.left, key);
        }
        else if(cmp > 0){
            get(x.right, key);
        }
        return x.val;
    }

    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old 
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.
     *
     * @param  key the key
     * @param  val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(Node x, Key key, Value val) {
        if (key == null){
            throw new IllegalArgumentException("key is null");
        }
        root = put(root, key, val);

        if (x == null){
            return new Node(key, val, 1); //initilized subtree count
        }

        int cmp = key.CpmparableTo(x.key);
        if (cmp < 0){
            x.left = put(x.left, key, val);
        }
        else if(cmp > 0){
            x.right = put(x.right, key, val);
        }
        else{
            x.val = val;
        }
        x.size = 1 + size(x.size) + size(x.right);
        return x;
    }

    // private Node put(Node x, Key key, Value val) {
        
    // }

    /**
     * Returns the smallest key in the symbol table.
     *
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key min(Node x) {
       return min(root).key;

       if (x == null){
        throw new IllegalArgumentException("Symbol table is empty");
       }
       else if (x.left == null){
        return x;
       }
       else{
        return min(x.left);
       }
    } 
    /**
     * Returns the largest key in the symbol table less than or equal to {@code key}.
     *
     * @param  key the key
     * @return the largest key in the symbol table less than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Key floor(Node x, Key key) {
        if (key == null){
            throw new IllegalArgumentException("key is null");
        }
        else if (size() == 0){
            throw new IllegalArgumentException("no such key");
        }
        Node x = floor(root, key);
        return x.key;

        if(x == null){
            return null;
        }
        int cmp = key.ComparableTo(x.key);
        if (cmp == o){
            return x;
        }
        if (cmp < 0){
            return floor(x.left, key);
        }
        Node t = floor(x.right, key);
        if (t != null){
            return t;
        }
        return x;
    } 

    // private Node floor(Node x, Key key) {
    //     return null;
       
    // } 

    
    

    /**
     * Return the key in the symbol table whose rank is {@code k}.
     * This is the (k+1)st smallest key in the symbol table.
     *
     * @param  k the order statistic
     * @return the key in the symbol table of rank {@code k}
     * @throws IllegalArgumentException unless {@code k} is between 0 and
     *        <em>n</em>–1
     */
    public Key select(Node x, int k) {
        if ((k<0) || k>=size()){
            return select(root, k).key;
        }
        if (x == null){
            return null;
        }
        int cmp = size(x.left);
        if (cmp<k){
            return select(x.left, k);
        }
        else if(cmp>k){
            return select(x.right, k-cmp-1);
        }
        return x;
    }

    // Return key of rank k
    /**
     * Returns all keys in the symbol table in the given range,
     * as an {@code Iterable}.
     *
     * @param  lo minimum endpoint
     * @param  hi maximum endpoint
     * @return all keys in the symbol table between {@code lo} 
     *         (inclusive) and {@code hi} (inclusive)
     * @throws IllegalArgumentException if either {@code lo} or {@code hi}
     *         is {@code null}
     */
    public Iterable<Key> keys(Node x, Queue<Key> queue, Key lo, Key hi) {
     if (lo == null){
        throw new IllegalArgumentException("first argument to keys() is null");
     }
     if (hi == null){
        throw new IllegalArgumentException("second argument to keys() is null");
     }
     Queue<Key> queue = new LinkedList<> ();
     Keys(root, queue, lo, hi);
     return queue;

     if (x == null){
        return;
     }
     int cmplo = lo.ComparableTo(x.key);
     int cmphi = hi.ComparableTo(x.key);

     if (cmplo < 0){
        keys(x.left, queue, lo, hi);
     }

     if (cmplo ==0 && cmphi == 0){
        queue.add(x.key);
     }
     if (cmphi > 0){
        keys(x.right, queue, lo, hi);
     }
    } 
    /* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/
  
    public static void main(String[] args) { 
        Solution<Integer, String> obj = new Solution<Integer, String>();
    }
}