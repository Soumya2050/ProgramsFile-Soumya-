package arrayProgram;

import java.util.ArrayList;

public class TakingInputFromArrayListAndReturnInAnArray {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);list.add(20);list.add(30);list.add(40);
		
		for (Integer integer : list) {
			int a[]=new int[integer.SIZE];
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	}
}
