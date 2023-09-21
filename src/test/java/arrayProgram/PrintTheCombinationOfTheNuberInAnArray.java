package arrayProgram;

public class PrintTheCombinationOfTheNuberInAnArray {
	
	
	public static void main(String[] args) {
		
		int a[]= {1,3,5,2,8,9,10} ;
		int n=11;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=a.length/2)
			for(int j=0;j<a.length;j++)
			{
				if((a[i]+a[j])==n)
				{
					System.err.println(a[i]+"+"+a[j]+"="+n);
				}
			}
		}
	}

}
