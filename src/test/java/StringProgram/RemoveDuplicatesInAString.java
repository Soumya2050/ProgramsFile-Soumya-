package StringProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInAString {

	public static void main(String[] args) {

		String s = "aabbaa";

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (Character character : set) {
			System.out.print(character + " ");
		}
	}

}
