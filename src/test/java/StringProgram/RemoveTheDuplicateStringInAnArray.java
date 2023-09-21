package StringProgram;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class RemoveTheDuplicateStringInAnArray {

	public static void main(String[] args) {
		String s = "abc abc abc abc abc";

		String str[] = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();

		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}

		for (String string : set) {
			System.out.println(string);
		}
	}

	@Test
	public void procedure2() {
		String s = "abc abc abc abc abc ";

		String str[] = s.split(" ");

		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length; i++) {
			map.put(str[i], null);
		}

		for (Entry<String, Object> set : map.entrySet()) {

			System.out.println(set.getKey());
		}
	}

	@Test
	public void procedure3() {
		String str="abc abc abc sbbdx xsnbd";
		String s[]={"abc","abc","abc","abc","sbbdx","xsnbd"};
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					s[i]="-1";
				}
			}
			if(s[i]!="-1") {
				System.out.print(s[i]+" ");
			}
		}
	}
	
	@Test
	public void procedure4() {
		String s = "my name is soumya jena";
		String str[]=s.split("\\s+");
		String s1="";
		for(int i=0;i<str.length;i++) {
			if(i%2==0) {
				StringBuilder sb = new StringBuilder(str[i]);
				s1+=sb.reverse()+" ";
			}
			else {
				s1=s1+str[i]+" ";
			}
		}
		System.out.println(s1);
	}
}
