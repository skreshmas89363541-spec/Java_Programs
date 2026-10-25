
class Student {
	private int age = 20;
	void display() {
		System.out.println("Display age :" +age);
	}
}
public class Basics {
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
	}
}