package StringProgram;

import java.util.LinkedHashSet;

public class PrintOccuranceOfCharacterWithoutDuplicate {
	
	public static void main(String[] args) {
		
		String s = "Malayalam";
		String str = s.toLowerCase();
		char ch[]=str.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		
		for (Character character : set) {
			int count = 0;
			for(int i=0;i<ch.length;i++)
			{
				if(character==ch[i])
				{
					count++;
				}
			}
			System.out.print(character+":"+count);
		}
	}

}
