import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = new int[]{2, 7, 11, 15};
		int target = 9;
		
		ArrayList<Integer> results = new ArrayList<>();
		
		for (int result : solution.twoSum(nums, target)) {
			results.add(result);
		}
		
		System.out.println(results);
		System.out.println("Done!");
	}
}
