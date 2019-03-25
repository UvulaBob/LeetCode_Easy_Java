import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
	public int numJewelsInStones(String J, String S) {
		int jewelCount = 0;
		for (String jewel : J.split("")) {
			Pattern pattern = Pattern.compile("(" + jewel + ")");
			Matcher matcher = pattern.matcher(S);
			while (matcher.find()) {
				jewelCount += matcher.groupCount();
			}
		}
		
		return jewelCount;

	}
}