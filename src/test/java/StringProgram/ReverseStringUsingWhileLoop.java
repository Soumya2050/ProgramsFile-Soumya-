package StringProgram;

import org.testng.annotations.Test;

public class ReverseStringUsingWhileLoop {

	public static void main(String[] args) {

		String s = "JyotiKrishna";

		int i = s.length() - 1;

		while (i >= 0) {
			System.out.print(s.charAt(i--));
		}

	}

	@Test
	public void t1() {

		System.out.println();
		String s1 = "hello";
		String s2 = new String("hello");
		System.out.println(s1 == s1);
	}

	@Test
	public void t2() {

		String s = "update.decline.accept.include";

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (!(ch[i] == '.')) {
				System.out.print(ch[i]);
			}
		}
		System.err.println();
		
		System.err.println("Another method ");
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) == '.')) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
	}
	
	@Test
	public void t3() {
		
		String s ="java234str789";
		
		String str=s.replaceAll("[^0-9]", "");
		
		System.out.println(str);
		
		System.err.println(15+35+"Chandan");
		
		System.out.println('A'+'a');
		
	}
	
}
