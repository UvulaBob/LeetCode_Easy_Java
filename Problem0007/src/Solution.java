class Solution {
	public int reverse(int x) {
		boolean negativeNumber = x < 0;
		StringBuilder sb = new StringBuilder(String.valueOf(x));
		if (negativeNumber) {
			sb.deleteCharAt(0);
		}
		sb.reverse();
		if (negativeNumber) {
			sb.insert(0, "-");
		}

		int result;
		try {
			result = Integer.parseInt(sb.toString());
		} catch (NumberFormatException e) {
			result = 0;
		}

		return result;
	}
}