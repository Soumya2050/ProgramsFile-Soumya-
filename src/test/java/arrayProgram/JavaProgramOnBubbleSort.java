package arrayProgram;

public class JavaProgramOnBubbleSort {
	
	public static void main(String[] args) {
		
		int a[]= {12,15,64,84,254,1454};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]= a[j];
					a[j]=temp;
				}
			}
		}
		for (int i : a) {
			System.err.print(i+" ");
		}
	}

}
