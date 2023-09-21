package StringProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromAString {
	
	public static void main(String[] args) {
		
		String str = "aabbccddee";
		char ch[] = str.toCharArray()
;		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		for (Character character : set) {
			System.err.print(character+" ");
		}
	}

}
