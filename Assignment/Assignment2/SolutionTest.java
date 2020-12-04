public class SolutionTest{
	public static void main(String[] args) {
		Solution<Integer, String> obj = new Solution<Integer, String>();
		obj.put(1, "ABDUL");
		System.out.println("ABDUL");
		obj.put(2, "HRITHIK");
		obj.put(3, "SAI");
		obj.put(6, "SAMAL");
		System.out.println("SAI");
		obj.put(4, "TASHI");
		System.out.println(obj.size());
		
		System.out.println(obj.isEmpty());
		System.out.println(obj.get(11));
		System.out.println(obj.size());
		System.out.println(obj.floor(11));
		System.out.println(obj.select(2));
		System.out.println(obj.keys(11,13));

		System.out.println("All Test Cases passed");
	}
}