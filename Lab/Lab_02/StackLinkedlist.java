//creating a class
class Node{
    public int element;
    public Node next;

    // constructor Node
    public Node(int element, Node next ){
        this.element = element; // refering this element to the value passed through the parameter
        next = null;
    }
}
public class StackLinkedlist{
    Node top;
    Node head;
    Node tail;
    int size;

    public StackLinkedlist(){
        top = null;
        head = null;
        tail = null;
        size = 0;
    }
    //checking if the stack is empty or not
    public boolean isEmpty()
    {
        if (this.top == null) {

            return true;    
        }
        else {
            return false;
        }
    }
    //size of the stacklinkedlist
    public int size(){
        return size;
    }
    //top of the element
    public int top()
    {
        if (isEmpty()){
            return 0;

        }
        else {
            return top.element;
        }
        
    }
    //adding values
    public void push(int n)
    {
        Node newest = new Node(n, null);
        if(this.isEmpty()) {
            this.head = newest;
            this.top = newest;
            this.tail = newest;
        }
        else {
            this.top.next= newest;
            this.top = newest;
        }
        size = size + 1;
    }
    //removing values
    public int pop() {
        if(this.isEmpty()) {
            return 0;
        }
        else {
            int x = this.top.element;
            if(this.head == this.top) {// only one node
                this.top = null;
                this.head = null;
            }
            else {
                Node newest = this.head;
                while(newest.next != this.top) // iterating to the last element
                newest = newest.next;
                newest.next = null;
                this.top = newest;
            }
            size = size - 1;
            return x;
        }
    }
    //main method
    public static void main(String[] args) {
        StackLinkedlist obj = new StackLinkedlist();

        obj.push(6);
        obj.push(2);
        obj.push(3);
                
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.size());
        System.out.println(obj.top());
         System.out.println(obj.size());
        System.out.println("All test pass");
    }
}