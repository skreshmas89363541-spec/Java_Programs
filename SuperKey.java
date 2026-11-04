
class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super();
        System.out.println("Dog constructor");
    }

    void display() {
        System.out.println("Parent Name: " + super.name);
        System.out.println("Child Name: " + name);
        super.sound();
    }
}

public class SuperKey {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}