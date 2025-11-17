interface SecurityUtils {
    static boolean isStrongPassword(String pwd) {
        return pwd.length() >= 8 &&
               pwd.matches(".*[A-Z].*") &&   
               pwd.matches(".*[a-z].*") &&  
               pwd.matches(".*\\d.*") &&     
               pwd.matches(".*[@#$%!].*");   
    }
}

public class PasswordTest {
    public static void main(String[] args) {
        String pass1 = "Admin123@";
        String pass2 = "admin";

        System.out.println(pass1 + " valid? " + SecurityUtils.isStrongPassword(pass1));
        System.out.println(pass2 + " valid? " + SecurityUtils.isStrongPassword(pass2));
    }
}

