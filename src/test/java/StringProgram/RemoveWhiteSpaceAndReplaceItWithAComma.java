package StringProgram;

import org.testng.annotations.Test;

public class RemoveWhiteSpaceAndReplaceItWithAComma {
	
	public static void main(String[] args) {
		
		String s = "remove white space and replace it with a comma";
		String str="";
		str+=s.replace(" ", ",");
		System.out.println(str);
	}
	
	@Test
	public void anotherMethod() {
		
		String s = "remove white space and replace it with a comma";
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+",");
		}		
	}

}
