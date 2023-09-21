package StringProgram;

import org.testng.annotations.Test;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		String s = "JyotiKrishna";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.err.print(s.charAt(i));
		}
	}
	
	@Test
	public void a() {
		int []s= {012,055,045,0125,045};
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
