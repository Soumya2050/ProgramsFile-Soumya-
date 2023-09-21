package StringProgram;

import java.util.ArrayList;

public class ProductOfTheNumberPresentIntheString {
	
	
	public static void main(String[] args) {
		
		String str="I a1m goi123ng to fi3215nd pro234duct for the num1212bers ins1212ide th1212is st3245ring";
		
		String []s=str.toLowerCase().split("\\D+");
		String r="";
		int product=1;
		int num=0;
		for(int i=1;i<s.length;i++)
		{	
			r+=num*10+s[i]+"*";
		}
		for (int i = 0; i < r.length(); i++) {
			System.out.println(r.charAt(i));
			product=product*r.charAt(i);
		}
		System.out.println(product);
	}

}
