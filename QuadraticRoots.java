
import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, root1, root2;

        System.out.print("Enter a, b and c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        d = (b * b) - (4 * a * c);

        if (a == 0) {
            System.out.println("It is not a quadratic equation.");
        } else if (d > 0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (d == 0) {
            root1 = -b / (2 * a);

            System.out.println("Roots are real and equal.");
            System.out.println("Root = " + root1);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);

            System.out.println("Roots are complex.");
            System.out.println("Root 1 = " + real + " + " + Math.abs(imaginary) + "i");
            System.out.println("Root 2 = " + real + " - " + Math.abs(imaginary) + "i");
        }

        sc.close();
    }
}
