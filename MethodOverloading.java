
class Calculator {
	int add( int a , int b) {
		return a+b ;
	}
	int add(int a , int b , int c) {
		return a+b+c;
	}
	double add( double a , double b) {
		return a+b ;
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Enter two integers :" +c.add(10,20));
		System.out.println("Enter three integers :" +c.add(20,30,40));
		System.out.println("Enter two double values :" +c.add(30.67,98.76));
	}
}