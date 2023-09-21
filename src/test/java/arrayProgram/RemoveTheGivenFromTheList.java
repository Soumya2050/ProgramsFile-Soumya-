package arrayProgram;

import java.util.ArrayList;

public class RemoveTheGivenFromTheList {

	public static void main(String[] args) {

		int a[] = { 2, 3, 7 };

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		for (Integer integer : list) {
			int count = 0;
//			System.err.print(integer+" ");
			for (int i = 0; i < a.length; i++) {
				if (integer == a[i]) {
					integer = -1;
				}
			}
			if (integer != -1) {
				System.err.print(integer + " ");
			}
		}
	}
	
	// Another process
	
	

}
