package StringProgram;

import java.util.LinkedHashSet;

public class CountTheNumberOfDuplicateCharInAString {
//	String s = "aaabbbcddde"
//	output = a3b3cd3e
	public static void main(String[] args) {

		String s = "aaabbbcddde";
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		for (Character character : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (character == s.charAt(i)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.print(character + "" + count);
			} else if (count == 1) {
				System.out.print(character);
			}
		}
	}
}
