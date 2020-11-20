public class SequentialSearchSTTest	{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();
		obj.put("k",7);
		obj.put("l",6);
		obj.put("m",2);
		obj.put("n",8);
		obj.delete("k");

		assert(obj.size() == 3);
		
		System.out.println(obj.keys());
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());



	}
}