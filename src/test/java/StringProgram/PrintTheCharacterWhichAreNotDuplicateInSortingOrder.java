package StringProgram;

import java.util.TreeSet;

public class PrintTheCharacterWhichAreNotDuplicateInSortingOrder {

	public static void main(String[] args) {

		String s = "Character";

		char ch[] = s.toCharArray();

		TreeSet<Character> set = new TreeSet<>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		for (Character character : set) {
			System.out.print(character);
		}
	}

}
