package StringProgram;

import org.testng.annotations.Test;

public class ReverseEachWordInAString {

	public static void main(String[] args) {

		String s = "i am in ooty";

		String str[] = s.split("\\s+");
		String rev = "";
		for (int i = 0; i < str.length; i++) {
			StringBuilder sb = new StringBuilder(str[i]);
			rev += sb.reverse() + " ";
		}
		System.err.print(rev);
	}
	
	@Test
	public void reverseEachWordInAString() throws InterruptedException {
		String s="soumya ranjan jena";
		
		String str[]=s.split(" ");
		
		for(int i=str.length-1;i>=0;i--)
		{
			String st = str[i]+" ";
			
			for(int j=st.length()-1;j>=0;j--)
			{
				
				System.err.print(st.charAt(j));
			}
		}
	}

}
