package StringProgram;

public class ReverseWordInAString {
	
	public static void main(String[] args) {
		
		String s = "wlecome to expleo";
		
		String []str = s.split(" ");
		String rev = "";
		for(int i=str.length-1;i>=0;i--)
		{
			rev+=str[i]+" ";
		}
		System.err.print(rev);
	}

}
