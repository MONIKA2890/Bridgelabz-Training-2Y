class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

class Login {
    private final String validUser = "admin";
    private final String validPass = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        }
        System.out.println("Login successful!");
    }
}

public class LoginTest {
    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.validate("admin", "wrongpass");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}

