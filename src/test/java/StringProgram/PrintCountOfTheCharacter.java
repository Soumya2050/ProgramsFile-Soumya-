package StringProgram;

public class PrintCountOfTheCharacter {
	
	
	public static void main(String[] args) {
		
		String s = "aweexxxyyyyyy";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		System.out.println("The num of char present in the string is :-"+count);
	}

}
