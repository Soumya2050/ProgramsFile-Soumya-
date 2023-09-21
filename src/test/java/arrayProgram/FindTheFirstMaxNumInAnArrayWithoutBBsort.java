package arrayProgram;

public class FindTheFirstMaxNumInAnArrayWithoutBBsort {

	public static void main(String[] args) {

		int a[] = { 7, -3, 0, 2, 1, -9 };
		int fmax = a[0];
		for (int i = 0; i < a.length; i++) {
			if (fmax < a[i]) {
				fmax = a[i];
			}
		}
		System.out.println("The first max number in an array is : " + fmax);
	}

}
