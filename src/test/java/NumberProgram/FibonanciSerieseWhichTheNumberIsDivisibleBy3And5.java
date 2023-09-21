package NumberProgram;

import org.testng.annotations.Test;

public class FibonanciSerieseWhichTheNumberIsDivisibleBy3And5 {

	public static void main(String[] args) {

		int n = 0;
		int n1 = 1;
		int temp;
		for (int i = 0; i <= 20; i++) {
			temp = n + n1;
			n = n1;
			n1 = temp;

			if (temp % 5 == 0 && temp % 3 == 0) {
				System.out.println(temp);
			}
		}
	}
	
	@Test
	public void t() {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<j)
				{
					System.out.print("");
				}
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}

}
