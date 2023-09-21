package NumberProgram;

public class ProgramForSuperCallStatement2 extends ProgramForSuperCallStatement {

	String s = "abcdef";
	static int a = 10;

	public void test1() {
		System.out.println("ProgramForSuperCallStatement2--  " + super.a);
	}

	public  static void main(String[] args) {
		
		int a=100;
		ProgramForSuperCallStatement2 p = new ProgramForSuperCallStatement2();
		p.test1();
		System.out.println(a);
	}
	

}
