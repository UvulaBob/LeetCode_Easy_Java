class Solution {
	public boolean checkPossibility(int[] nums) {
		boolean alteredOneValue = false;
		for (int index = 0; index < nums.length - 1; index++) {
			if (!(nums[index] <= nums[index + 1])) {
				if (alteredOneValue) {
					return false;
				} else {
					alteredOneValue = true;
					if (index == 0) {
						nums[index] = nums[index + 1];
					} else if (index == nums.length - 2){
						nums[index + 1] = nums[index];
					} else {
						if (nums[index + 1] < nums[index - 1]) {
							nums[index + 1] = nums[index];
						} else {
							nums[index] = nums[index + 1] - 1;
						}
					}
					index = -1;
				}
			}
		}
		return true;
	}
}