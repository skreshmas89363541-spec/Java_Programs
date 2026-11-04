class Friend {
    private String name;
    private int age;

    Friend(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Friend constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void displayFriend() {
        System.out.println("Friend Name: " + name);
        System.out.println("Friend Age: " + age);
    }
}

class BestFriend extends Friend {
    private String hobby;

    BestFriend(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
        System.out.println("BestFriend constructor called");
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    void displayHobby() {
        System.out.println("Hobby: " + hobby);
    }
}

class CloseFriend extends BestFriend {
    private String city;

    CloseFriend(String name, int age, String hobby, String city) {
        super(name, age, hobby);
        this.city = city;
        System.out.println("CloseFriend constructor called");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    void displayCity() {
        System.out.println("City: " + city);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        CloseFriend f = new CloseFriend(
            "Rahul", 20, "Playing Cricket", "Hyderabad"
        );

        f.displayFriend();
        f.displayHobby();
        f.displayCity();

        System.out.println("Updated Friend Name: " + f.getName());
    }
}