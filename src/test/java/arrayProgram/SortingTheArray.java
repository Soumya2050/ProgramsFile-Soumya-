package arrayProgram;

public class SortingTheArray {
	
	public static void main(String[] args) {
		
		int a[]= {1,-5,15,-7,0,25,-48};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.err.print(a[i]+" ");
		}
	}

}
