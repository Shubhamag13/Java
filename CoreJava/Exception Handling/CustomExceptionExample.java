class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    static void vote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Vote allowed");
    }

    public static void main(String[] args) {
        try {
            vote(17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
