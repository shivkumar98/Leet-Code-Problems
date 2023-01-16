package Problems;

public class Q14_longest_common_prefix {
	 
	public static String longestCommonPrefix(String[] strs) {
		// assume first string contains longest prefix
		// if there is a longer string OR character does not match
		// break for loop
		int matchingCharacters = 0;		
		 OUTER: for (int i=0;i<strs[0].length();i++) {
			char c = strs[0].charAt(i);
			// check all strings
			for (String str: strs) {
				if (i> str.length()-1 || str.charAt(i)!=c)
					break OUTER;
				
			}
			matchingCharacters++;
		}
		return strs[0].substring(0, matchingCharacters);
	}
	
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"hell","he","hey"}));
	}

}
