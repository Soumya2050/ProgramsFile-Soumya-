package arrayProgram;

public class FindSumOf3MinNumInAnArray {

	public static void main(String[] args) {

		int a[] = { 7, -6, 11, 9, 0, 4 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += a[i];
		}
		System.out.println("The sum of min 3 num is: " + sum);
	}

}
