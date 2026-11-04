
interface Add_Sub {
    public void add(double a, double b);
    public void sub(double a, double b);
}

interface Mul_Div {
    public void mul(double a, double b);
    public void div(double a, double b);
}

interface Calculator extends Add_Sub, Mul_Div {
    public void printResult(double result) ;
}
public class MyCalculator implements Calculator {
        public void add(double a , double b) {
        	double result = a + b ;
        	printResult(result);
        }
        public void sub(double a, double b) {
        double result = a - b ;
        printResult(result);
    }

    public void mul(double a, double b) {
      double result = a * b ;
        printResult(result);
    }

    public void div(double a, double b) {
         double result = a / b ;
        printResult(result);
    }
    public void printResult( double result) {
    	System.out.println("The result is :  " +result);
    }
    public static void main(String[] args) {
        MyCalculator c = new MyCalculator();

        c.add(20.5, 10.5);
        c.sub(20.5, 10.5);
        c.mul(20.5, 10.5);
        c.div(20.5, 10.5);
    }
}
