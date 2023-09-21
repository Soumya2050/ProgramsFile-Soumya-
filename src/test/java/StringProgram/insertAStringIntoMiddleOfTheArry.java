package StringProgram;

import java.util.ArrayList;

public class insertAStringIntoMiddleOfTheArry {

	public static void main(String[] args) {

		String z = "my name is xyz ghj kjh";
		String[] str = z.split("\\s+");
		String s[] = new String[str.length + 1];
		int a = str.length / 2;
		for (int i = 0; i < s.length; i++) {
			if (i == a) {
				s[i] = "TYSS";
			} else if (i < a) {
				s[i] = str[i];
			} else {
				s[i] = str[i-1];
			}
		}
		for (String string : s) {
			System.out.print(string + " ");
		}
	}

}
