package StringProgram;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.DateFormatter;

import org.testng.annotations.Test;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class CountTheNumberOfWordPresentInAString {

	public static void main(String[] args) {

		String s = "Sjshd sndf dsnm kjdhsuf sdjfh ekjrdf";

		char ch[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] == ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void a() throws InterruptedException {
		String s = "1,000.00 Rs";

		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				str+=s.charAt(i);
				//Thread.sleep(2000);
			}
		}
		int ri=Integer.parseInt(str)/100;
		System.out.println(ri);
	}
	
	@Test
	public void b() {
		String first[]= {"attitude", "attend","Dump","atter"};
		String Second[]= {"Vinay","Vidya","Vijay","Anupam","Virat"};
		String ap1="at";
		String ap2="Vi";
		
		for(int i=0;i<first.length;i++)
		{
			if(first[i].startsWith(ap1))
			{
				System.out.print(first[i]+" ");
			}
		}
		
		for(int j=0;j<Second.length;j++)
		{
			if(Second[j].startsWith(ap2)) {
				System.err.print(Second[j]+" ");
			}
		}
		
	}
	@Test
	public void test() {
////		int a=2;
////		int b=3;
//		int i = 123456;
////	op  int j = 654321;
//		int rem=0;
//		while(i>0)
//		{
//			rem=rem*10+i%10;
//			i=i/10;
//		}
//		System.out.println(rem);
		
		String[] st = {"air" ,"india", "(17)"};
		String er=st[st.length-1].replaceAll("\\W+","");
		int a =Integer.parseInt(er);
		
//		List<String> l = new ArrayList()<String>();
		
	}
	@Test
	public  void rDate() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd mm");
		Date d = new Date();
		System.out.println(sdf.format(d));
//		String[] dt = sdf.format(d).split(" ");
//		System.out.println();
//		int month =Integer.parseInt(dt[1]);
//		int date =Integer.parseInt(dt[0]);
//		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
//			date+=r;
//			if(date>31) {date=date-31;month+=1;}
//		}else if (month==2) {
//			date+=r;
//			if(date>28) {date=date-28; month+=1;}
//		}else {
//			date+=r;
//			if(date>30) {date=date-30;month+=1;}
//		}
//		System.out.println("Date-->"+ date +"   Month -->" + month);
//		return date+" "+month;
	}
	
	@Test
	public void tr() {
//		Collection c = new Collection("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
		List<String> str = new ArrayList<String>();
		for(int i =0;i<str.size();i++) {
			for(int j=i;;j++) {
				System.out.print(str.get(j)+" ");
				if(j%8==0 && j!=0) {i=j+1; break;}
			}
			System.out.println();
		}
	}
	
	@Test
	public void d() {
		
	}
}
