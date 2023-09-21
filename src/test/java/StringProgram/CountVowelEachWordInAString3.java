package StringProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.commons.collections4.iterators.EntrySetMapIterator;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class CountVowelEachWordInAString3 {
	
	
	public static void main(String[] args) {
		
		String s[]= {"Mrudula","Chat","Zoom"};
		TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
		for(int i=0;i<s.length;i++)
		{
			char ch[]=s[i].toLowerCase().toCharArray();
			Arrays.sort(ch);
			int count=0;
			for (char c : ch) {				
				if("aeiou".contains(""+c))
				{
					count++;
				}
			}
			map.put(count, s[i]);
		}
		
		for(Entry<Integer, String> a : map.entrySet())
		{
			System.out.println(a.getValue()+"-"+a.getKey());
		}
		
	}

}
