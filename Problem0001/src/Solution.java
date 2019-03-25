class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int currentNumberIndex = nums.length - 1; currentNumberIndex >= 0; currentNumberIndex--) {
			int currentNumber = nums[currentNumberIndex];

			boolean sumFound = false;
			for (int otherNumberIndex = 0; otherNumberIndex < currentNumberIndex; otherNumberIndex++) {
				int otherNumber = nums[otherNumberIndex];
				if (currentNumber + otherNumber == target) {
					result = new int[] {otherNumberIndex, currentNumberIndex};
					sumFound = true;
					break;
				}
			}

			if (sumFound) {
				break;
			}
		}

		return result;
	}
}