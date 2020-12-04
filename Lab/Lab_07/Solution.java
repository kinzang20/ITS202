import java.util.*;

public class Solution<Key extends Comparable<Key>, Value> {
    private Node root;         // root of BST

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;          // number of nodes in subtree

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
            left = null;
            right = null;
        }
    }

    public Solution() {
        root = null;
    }
    public boolean isEmpty() {
        if (size() == 0) {
            return true;  
        }
        return false;
       
    }
    public int size() {
        return size(root);
    }

    // return number of key-value pairs in BST rooted at x
    private int size(Node x) {
        if (x == null) {
            return 0;   
        }
        else{
            return x.size;
        }
       
    }
    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Key is Null");
        }
        return get(root, key);
        
    }

    private Value get(Node x, Key key) {
        if (x == null) {
            return null;
        } 
        int temp = key.compareTo(x.key);

        if (temp < 0) {
            get(x.left, key);
            
        } 
        else if (temp > 0) {
            get(x.right, key);
            
        }
        return x.val;
    }

    public void put(Key key, Value val) {
        if (key == null) {
            throw new IllegalArgumentException("Key is Null");
        }
        root =  put(root, key, val);  
    }

    private Node put(Node x, Key key, Value val) {
        if (x == null){
            return new Node(key, val, 1); 
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0){
         x.left  = put(x.left,  key, val);
        }
        else if (cmp > 0){
         x.right = put(x.right, key, val);
        }

        else{
            x.val   = val;
        }

       x.size = 1 + size(x.left) + size(x.right);
        return x;
    }

    public Key min() {
        return min(root).key;   
    } 

    private Node min(Node x) { 
        if (x == null) {
            throw new NoSuchElementException("Symbol table is empty"); 
        }
        else if (x.left == null) {
            return x; 
        }
        else {
            return min(x.left);
        }     
    } 
    public Key floor(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Key is Null"); 
        }   
        else if (size() == 0) {
            throw new IllegalArgumentException("No such key");
        }
        Node x = floor(root, key);
        return x.key;
    } 

    private Node floor(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0){
         return x;
        }
        if (cmp <  0) {
            return floor(x.left, key);
        }
        Node t = floor(x.right, key); 
        if (t != null) {
            return t;
        }
        return x;      
    } 

    public Key select(int k) {
        if ((k<0) || k>=size()) {
            throw new IllegalArgumentException("Rank should be between 0 ans its size");
        }
        return select(root, k).key;
 
    }
    // Return key of rank k. 
    private Node select(Node x, int k) {
        if (x == null) {
            return null; 
        }
        int z = size(x.left);
        if (z>k) {
            return select(x.left, k);     
        }
        else if (z<k) {
            return select(x.right, k-z-1);    
        }
        return x;
    } 
    public Iterable<Key> keys(Key lo, Key hi) {
        if (lo == null) {
            throw new IllegalArgumentException("first argument to keys() is null");
        }
        if (hi == null) {
            throw new IllegalArgumentException("second argument to keys() is null");
        }
        Queue<Key> queue = new LinkedList<> ();
        keys(root, queue, lo, hi);
        return queue;
     
    } 

    private void keys(Node x,Queue<Key> queue, Key lo, Key hi) { 
        if (x == null) {
            return; 
        }
        int cmplo = lo.compareTo(x.key); 
        int cmphi = hi.compareTo(x.key); 

        if (cmplo < 0) {
            keys(x.left, queue, lo, hi); 
        }
        if (cmplo <= 0 && cmphi >= 0) {
            queue.add(x.key); 
        }
        if (cmphi > 0) {
            keys(x.right, queue, lo, hi);
        }     
    } 
    public static void main(String[] args) { 
        Solution<Integer, String> obj = new Solution<Integer, String>();
      
    }
}