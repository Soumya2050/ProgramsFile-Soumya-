package arrayProgram;

import java.util.LinkedHashSet;

public class PrintTheNoOfTimesACharacterIsPresentInString {
	
	public static void main(String[] args) {
		
		String s = "PrintTheNoOfTimesACharacterIsPresentInString";
		char[]ch = s.toCharArray();
		
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
			System.err.println(character+" occures : "+count+" Times");
		}
	}

}
