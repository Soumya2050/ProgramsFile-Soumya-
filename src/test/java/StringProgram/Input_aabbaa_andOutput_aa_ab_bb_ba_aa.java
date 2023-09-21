package StringProgram;

public class Input_aabbaa_andOutput_aa_ab_bb_ba_aa {
	
	public static void main(String[] args) {
		
		String str = "aabbaa";
		
		for(int i=0;i<str.length()-1;i++)
		{
			System.out.print(str.substring(i, i+2)+" ");
		}
	}

}
