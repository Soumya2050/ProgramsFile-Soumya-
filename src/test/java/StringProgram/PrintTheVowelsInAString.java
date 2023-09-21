package StringProgram;

import java.util.Arrays;

public class PrintTheVowelsInAString {
	
	public static void main(String[] args) {
		
		String s="education".toLowerCase();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.err.print(ch+" ");
			}
		}
	}

}
