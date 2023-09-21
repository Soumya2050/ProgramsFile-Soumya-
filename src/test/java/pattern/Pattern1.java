package pattern;

public class Pattern1 {
	//	A 
	//	A B 
	//	A B C 
	//	A B C D 
	//	A B C D E
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			for(int j=1;j<=5;j++)
			{
				if(i<j)
				{
					System.out.print("");
				}else {
					System.out.print(ch+++" ");
				}
			}
			System.out.println();
		}
	}

}
