package NumberProgram;

import java.util.Scanner;

public class PalindromeAndPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int temp = n;
		int rem = 0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			while (n > 0) {
				rem = rem * 10 + n % 10;
				n = n / 10;
			}
			if (rem == temp) {
				System.err.println("The number is palindrome");
			} else {
				System.err.println("The number is not palindrome");
			}
		} else {
			System.out.println("This is not a prime number");
		}
	}

}
