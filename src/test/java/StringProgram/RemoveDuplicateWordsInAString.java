package StringProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInAString {
	
	public static void main(String[] args) {
		
		String s = "I am a            software Engineer         software Engineer";
		
		String str[] = s.split("\\s+");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		for (String string : set) {
			System.out.print(string.toString()+" ");
		}
	}

}
