package arrayProgram;

public class PrimeNumberFrom1_100 {

	public static void main(String[] args) {

		int m = 0, n = 100;

		for (int i = m; i <= n; i++) {

			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.err.print(i + " ");
			}
		}

	}
}
