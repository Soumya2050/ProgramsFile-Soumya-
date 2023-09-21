package StringProgram;

import java.time.Duration;
import java.util.*;
import java.io.*;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class Input_MynameIsSeleniumANdOutPutIs_av_ajsi_em_anym {

	public static void main(String[] args) {

		String s = "ab abc abcd";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
//		System.out.println("The reverse word is : "+rev);
		rev = rev.replace(" ", "");
//		System.out.println("After replace : "+ rev);
		String revWord = "";
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			if (s.charAt(i) == ' ') {
				revWord += s.charAt(i);
			} else {
				revWord += rev.charAt(j);
				j++;
			}
		}

		System.out.print(revWord);
	}

	@Test
	public void method2() {

		String s = "abcdef";
		String s1="bcdef";
		String s3="";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
					System.out.print(s.charAt(i));
			}
			
			
		}
		for(int i=0;i<s.length();i++) {
			String s2=s.charAt(i)+"";
			if(s1.contains(s2)) {
				s3=s3+s2;
			}
		}
		char[] charArray = s3.toCharArray();
		Arrays.sort(charArray);
		System.err.println(charArray);

	}
	
	@Test
	public void arraysort()
	{
		char[] ch= {'a','c','e','b','d'};
		int no=1;
		for(int i=0;i<ch.length/2;i++)
		{
			char temp=ch[i];          //a
			ch[i]=ch[ch.length-no];    //d
			ch[ch.length-no]=temp; 
			no++;                       //a
		}
		System.out.println(Arrays.toString(ch));
	}
	@Test
	public void sort() {
		
		char[] ch= {'a','c','e','b','d'};
		int n=ch.length;		
		for(int i=0;i<n/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[n-i-1];
			ch[n-i-1]=temp;
		}
		System.out.println(Arrays.toString(ch));
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
	}
	
	@Test
	public void characterArraySort() {
		char[] ch= {'a','c','e','b','d'};
		System.out.println("Printing the array");
		int n=ch.length;		
		for(int i=0;i<n/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[n-i-1];
			ch[n-i-1]=temp;
		}
		System.out.println(Arrays.toString(ch));
		System.out.println("Array in Descending order ");
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
	}
	
	@Test
	public void reverse() {
		double []d={18.78,10.32,20.09,8.78,5.1,23.96};
		int n=d.length;
		System.out.println("Reverse the double array");
		for(int i=0;i<n/2;i++)
		{
			double temp=d[i];
			d[i]=d[n-i-1];
			d[n-i-1]=temp;
		}
		System.out.println(Arrays.toString(d));
		System.out.println("Descending order of Array");
		for(int i=0;i<d.length;i++)
		{
			for(int j=i+1;j<d.length;j++)
			{
				if(d[i]<d[j])
				{
					double temp=d[i];
					d[i]=d[j];d[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(d));
	}
	@Test
	public void occuranceOfStringDifferentWays() {
		 String s="abcd bac fcb".replace(" ", "");
		 LinkedHashMap<Character,Integer>map = new LinkedHashMap<>();
		 for(int i=0;i<s.length();i++)
		 {
			 if(!(map.containsKey(s.charAt(i))))
			 {
				 map.put(s.charAt(i),1);
			 }else {
				 map.put(s.charAt(i), map.get(s.charAt(i))+1);
			 }
		 }
		 System.out.println(map);		 
	}
	@Test
	public void selenium() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/srjen/OneDrive/Desktop/table.html");
		String name="manua";
		String sub = driver.findElement(By.xpath("//td[.='"+name+"']/following-sibling::td")).getText();
		System.out.println(sub);
		
		driver.quit();
	}
}
