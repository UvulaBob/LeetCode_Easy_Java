class Solution {
	public String toLowerCase(String str) {
		String output = "";
		for (char character : str.toCharArray()) {
			if (character >= 65 && character <= 90) {
				output += String.valueOf(character += 32);
			} else {
				output += String.valueOf(character);
			}
		}
		return output;
	}
}