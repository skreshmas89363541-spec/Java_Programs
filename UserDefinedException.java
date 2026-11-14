
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class UserDefinedException {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new InvalidAgeException(
                    "Age must be 18 or above."
                );
            }

            System.out.println("Eligible to vote.");
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program completed.");
    }
}
