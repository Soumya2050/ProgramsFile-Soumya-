package mapProgram;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccuranceOfDuplicateUsingMap {
	
	public static void main(String[] args) {
		
		String s="i am soumya and soumya";
		String str[]=s.split(" ");
		LinkedHashMap<String, Integer>map = new LinkedHashMap<>();
		for(int i=0;i<str.length;i++)
		{
			if(!(map.containsKey(str[i]))) {
				map.put(str[i], 1);
			}else {
				map.put(str[i], map.get(str[i])+1);
			}
		}
		for(Entry<String, Integer>m:map.entrySet())
		{
			if(m.getValue()>1) {
				System.out.println(m.getKey()+": occures "+m.getValue()+": times");
			}
		}
	}
	
	@Test
	public void occuranceOfDuplicateWordInAString() {
		String s="i am soumya and soumya";
		String str[]=s.split(" ");
		LinkedHashMap<String, Object>map = new LinkedHashMap<>();
		
		for(int i=0;i<str.length;i++)
		{
			map.put(str[i], null);
		}
		for (Entry<String, Object> m : map.entrySet()) {
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(m.getKey().contains(str[i])) {
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(m.getKey()+"="+count);
			}
		}
	}

}
