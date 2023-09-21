package StringProgram;

public class CountVowelEachWordInAString {
	
	public static void main(String[] args) {
		
		String s []= {"Vijay","Vivek","Jawahar"};
		for(int i=0;i<s.length;i++)
		{
			char[] ch = s[i].toLowerCase().toCharArray();
			int count=0;
			for (char c : ch) {
				
				if("aeiou".contains(""+c))
				{
					count++;
				}
			}
			
			System.out.println(s[i]+"-"+count);
			
		}
	}

}
