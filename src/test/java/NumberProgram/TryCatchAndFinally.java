package NumberProgram;

public class TryCatchAndFinally {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("This is try block");
			int a=10/0;
		} catch (Exception e) {
			System.out.println("This is catch block");
		}
		finally {
			System.out.println("Happy ending");
		}
	}

}
