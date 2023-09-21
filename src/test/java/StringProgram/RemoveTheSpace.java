package StringProgram;

public class RemoveTheSpace {
	
	public static void main(String[] args) {
		
		String s = "my name   is Radha";
		String str[]=s.split("\\s+");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]);
		}
	}

}
