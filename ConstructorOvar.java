
class Student {
	int rollNo ;
	String name ;
	Student() {
		rollNo = 99;
		name = "Reshma";
	}
	Student(int r) {
		rollNo = r ;
		name = "Reshma";
	}
	Student(int r , String n) {
		rollNo = r ;
		name = n ;
	}
	void display() {
		System.out.println("Roll Number :" +rollNo);
		System.out.println("Name :" +name);
		System.out.println();
	}
}
public class ConstructorOver {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(99 );
		Student s3 = new Student(99 , "Reshma");
		s1.display();
		s2.display();
		s3.display();
	}
}