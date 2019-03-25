public class Main {

	public static void main (String[] args) {
		//true
		System.out.println(new Solution().checkPossibility(new int[] {4,2,3}));

		//false
		System.out.println(new Solution().checkPossibility(new int[] {4,2,1}));

		//false
		System.out.println(new Solution().checkPossibility(new int[] {3,4,2,3}));
		
		//true
		System.out.println(new Solution().checkPossibility(new int[] {-1,4,2,3}));
		
		//true
		System.out.println(new Solution().checkPossibility(new int[] {2,3,3,2,4}));

		//true
		System.out.println(new Solution().checkPossibility(new int[] {1,2,4,5,3}));

		System.out.println("Done!");
	}
}
