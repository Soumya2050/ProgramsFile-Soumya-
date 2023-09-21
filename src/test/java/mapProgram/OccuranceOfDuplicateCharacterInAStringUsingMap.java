package mapProgram;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OccuranceOfDuplicateCharacterInAStringUsingMap {
	
	public static void main(String[] args) {
		
		String s="abcabs";
		LinkedHashMap<Character, Integer>map = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(!(map.containsKey(s.charAt(i))))
			{
				map.put(s.charAt(i), 1);
			}else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		for(Entry<Character, Integer> m:map.entrySet()) {
			if(m.getValue()>1)
			{
				System.out.print(m);
			}
		}
	}

}
