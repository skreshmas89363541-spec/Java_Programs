
class Student {
	int rollNo ;
	String name ;
	Student(int r , String n) {
		rollNo = r;
		name = n;
	}
	void display() {
		System.out.println("Roll Number :" +rollNo);
		System.out.println("Name :" +name);
	}
}
public class Constructor {
	public static void main(String[] args) {
		Student s = new Student(99 , "Reshma");
		s.display();
	}
}