package Problems;

public class Q13_roman_to_integer {
	
	// leetCode solution:
	static int romanToInt(String s) {
		s=s.replaceAll("IV", "IIII").replaceAll("IX", "VIIII")
				.replaceAll("XL", "XXXX")
				.replaceAll("XC", "LXXXX")
				.replaceAll("CD", "CCCC")
				.replaceAll("CM", "DCCCC");
		int total = 0;
		char[] charArr = s.toCharArray();
		for (int i=0;i<charArr.length;i++) {
			switch (charArr[i]) {
				case 'I': total+=1; break;
				case 'V': total+=5; break;
				case 'X': total+=10; break;
				case 'L': total+=50; break;
				case 'C': total+=100; break;
				case 'D': total+=500; break;
				case 'M': total+=1000; break;
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		System.out.println(romanToInt("I")); // 1
		System.out.println(romanToInt("II")); // 2
		System.out.println(romanToInt("III")); // 3
		System.out.println(romanToInt("IV")); // 4
		System.out.println(romanToInt("V")); // 5
		System.out.println(romanToInt("VIII")); // 8
		System.out.println(romanToInt("IX")); // 9
		System.out.println(romanToInt("X")); // 10
		System.out.println(romanToInt("XIII")); //13
		System.out.println(romanToInt("MCMXCIV"));
	}

}
