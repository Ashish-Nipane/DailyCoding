package coding_daily_3;

import java.util.Arrays;

public class CheckTwoStringAnagram {

	public static void main(String[] args) {
		String s1 = "Care";
		String s2 = "Race";
		
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		
		if(s1.length() == s2.length()) {
			char[] charArray1 = s3.toCharArray();
			char[] charArray2 = s4.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result = Arrays.equals(charArray1, charArray2);
			if(result) {
				System.out.println(s1 + " and " + s2 + " are anagram.");
			}
			else {
				System.out.println(s1 + " and " + s2 + " are not anagram.");
			}
		}
		else {
			System.out.println(s1 + " and " + s2 + " are not anagram.");	
		}	
	}
}
