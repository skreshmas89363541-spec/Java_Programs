import java.util.Scanner ;
import java.util.InputMismatchException ;
class MultipleCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		try {
			System.out.println("Enter an integer :");
			int n = sc.nextInt();
			System.out.println("Number :"+n);
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException occured :");
		}
		catch(IllegalArgumentException e) {
			System.out.println("IllegalAgeExceptio occured :");
		}
		catch(Exception e) {
			System.out.println("Some other exception occured ");
		}
		System.out.println("Program continuous normally");
		sc.close();
	}
}