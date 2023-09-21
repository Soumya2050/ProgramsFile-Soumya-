package StringProgram;

import java.util.LinkedHashSet;

public class PrintOccuranceOfWord {
	
	public static void main(String[] args) { 
		
		String s = "My name is rishav it contains ri and shav";
		
		String str[] =s.split("\\s+");
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		for (String string : set) {
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(string == str[i])
				{
					count++;
				}
			}
			System.out.println(string+": Occures - "+count+": Times");
		}
	}
	
}