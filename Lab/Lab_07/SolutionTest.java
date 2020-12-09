public class SolutionTest{
	public static void main(String[] args) {
		Solution<Integer, String> obj = new Solution<Integer, String>();
		obj.put(11, "Kinzang");
		obj.put(12, "Wangchuk");
		obj.put(13, "Karma");
		obj.put(14, "Choda");
		System.out.println(obj.isEmpty());
		System.out.println(obj.get(11));
		System.out.println(obj.size());
		System.out.println(obj.floor(11));
		System.out.println(obj.select(2));
		System.out.println(obj.keys(11,13));

		System.out.println("All Test Cases passed");
	}
}
