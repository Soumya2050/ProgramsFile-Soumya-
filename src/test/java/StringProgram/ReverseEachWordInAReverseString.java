package StringProgram;

public class ReverseEachWordInAReverseString {

	public static void main(String[] args) {

		String str = "My name is ok";

		String s[] = str.split("\\s+");
//		String rev="";
		for (int i = s.length - 1; i >= 0; i--) {
//			rev = rev+s[i]+" ";
			String s3 = s[i];
			for (int j = s3.length() - 1; j >= 0; j--) {
				System.out.print(s3.charAt(j));
			}
			System.out.print(" ");
		}
//		String s1[]=rev.split("\\s+");
//		String s2="";
//		for(int i=0;i<s1.length;i++)
//		{
//			StringBuilder sb = new StringBuilder(s1[i]);
//			s2+=sb.reverse()+" ";
//		}
//		
//		for (int i = 0; i < s1.length; i++) {
//			
//		}
//		System.err.print(s2);
	}

}
