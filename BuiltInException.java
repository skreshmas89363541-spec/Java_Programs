public class BuiltInException {
	public static void main(String[] args) {
		String name = "Reshma" ;
		try {
			 System.out.println("Student Name: " + name);
            System.out.println("First Character : " + name.charAt(0));
		    System.out.println("Character :" + name.charAt(15));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("InvalidStringIndex ");
		}
		finally {
			System.out.println("Program Completed ");
		}
	}
}
