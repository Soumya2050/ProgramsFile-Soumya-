package mapProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class RemoveDuplicateUsingMap {
	
	public static void main(String[] args) {
		
		String s="abcd abc abcd abc";
		String str[]=s.split(" ");
		LinkedHashMap<String, Object>map = new LinkedHashMap<>();
		for(int i=0;i<str.length;i++)
		{
			map.put(str[i]+" ", null);
//			if(!(map.containsKey(str[i]))) {
//				map.put(str[i]+" ",null);
//			}
		}
//		System.out.println(map);
		for(Entry<String, Object>m :map.entrySet()) {
			System.out.print(m.getKey());
		}
	}
	

}
