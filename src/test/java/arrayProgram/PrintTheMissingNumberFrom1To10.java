package arrayProgram;

public class PrintTheMissingNumberFrom1To10 {
	
	public static void main(String[] args) {
		
		int a[]={1, 2, 5};
		
		for(int i=1;i<=10;i++)
		{
			boolean flag = false;
			for (int j : a) {
				if(j==i)
				{
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.print(i+" ");
			}
		}
	}

}
