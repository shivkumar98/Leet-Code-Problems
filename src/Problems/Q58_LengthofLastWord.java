package Problems;

public class Q58_LengthofLastWord {

	/*
	 * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
	 */
	public static int lengthOfLastWord(String s) {
		String[] splitString = s.split(" ");
		return splitString[splitString.length-1].split("").length;
        
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));
	}
	
	
	

}
