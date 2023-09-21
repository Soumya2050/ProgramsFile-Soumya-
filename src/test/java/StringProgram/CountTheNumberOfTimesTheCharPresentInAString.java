package StringProgram;

public class CountTheNumberOfTimesTheCharPresentInAString {
	
	public static void main(String[] args) {
		
		String s = "IMMUNUTIES ";
		char ch='U';
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
