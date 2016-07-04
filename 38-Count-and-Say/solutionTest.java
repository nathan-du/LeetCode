public class Solution {
    public String countAndSay(int n) {
		String str = "1";
		while (--n > 0)
			str = next_seq(str);
		return str;
	}

	public String next_seq(String str) {
		StringBuffer nextstr = new StringBuffer();
		int count = 1;
		int i;
		for (i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i-1)) {
				count++;
			} else {
				nextstr.append(count).append(str.charAt(i - 1));
				count = 1;
			}
		}
		nextstr.append(count).append(str.charAt(i - 1));
		return nextstr.toString();
	}
}