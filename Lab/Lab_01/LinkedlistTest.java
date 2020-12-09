//to test the method in linkedlist
public class LinkedlistTest{
	public static void main(String[] args) {
		Linkedlist obj1 = new Linkedlist(); //creating object for the linklist
		obj1.addFirst(1);
		obj1.addLast(2);
		obj1.addLast(3);

		//testing whether it is wrong or right
		assert(obj1.isEmpty() == false);
		assert(obj1.size() == 3);
		assert(obj1.first() == 1);
		assert(obj1.last() == 3);
		assert(obj1.removeFirst() == 1);
		assert(obj1.size() == 2);
		assert(obj1.first() == 2);


		
		//when using assert run the command java -ea filename to execute the file.
		System.out.println("All test cases passed");	
	}
}