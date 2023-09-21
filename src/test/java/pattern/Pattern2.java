package pattern;

public class Pattern2 {
	
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				if(i<j)
				{
					System.out.print(" ");
				}
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
