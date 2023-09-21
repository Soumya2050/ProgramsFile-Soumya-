package StringProgram;

import org.testng.annotations.Test;

public class SeleniumAndOUtPuts_se_sel_sele_selen_seleni_seleniu_selenium {

	public static void main(String[] args) {

		String s = "Selenium";

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}

	}
	@Test
	public static void prtc1() {
		String s1 = "aabbaa";
		for (int i = 0; i < s1.length() - 1; i++) {
			System.out.print(s1.substring(i, i + 2) + " ");
		}

	}

}
