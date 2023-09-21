package arrayProgram;

import org.testng.annotations.Test;

public class FindTheClosestNumberInAnArray {

	public static void main(String[] args) {

		int a[] = {20, 32, 31, 30, 50, 10, 40 };
		int num = 15;
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				sum+=a[i]+a[j];
			}
			if(num-sum<=num)
			{
				System.out.println(sum);
			}
		}
	}


}
